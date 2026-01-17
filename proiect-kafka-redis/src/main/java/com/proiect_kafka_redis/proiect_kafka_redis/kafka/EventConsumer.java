package com.proiect_kafka_redis.proiect_kafka_redis.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.proiect_kafka_redis.proiect_kafka_redis.db.EventEntity;
import com.proiect_kafka_redis.proiect_kafka_redis.db.EventRepository;
import com.proiect_kafka_redis.proiect_kafka_redis.redis.RedisEventService;

@Service
public class EventConsumer {
	
	private final EventRepository eventRepo;
	private final RedisEventService redisEv;
	
	public EventConsumer(EventRepository eventRepo, RedisEventService redisEv) {
		this.eventRepo = eventRepo;
		this.redisEv = redisEv;
	}

	@KafkaListener(
			topics = "test-event",
			groupId = "spring-prj-group"
	)
	public void consumer(KafkaEvent event) {
		EventEntity ent = new EventEntity(event.getContents());
		eventRepo.save(ent);
		
		System.out.println("Event from Kafka: " + event);
		
		redisEv.saveLast(event);
	}
	
	
}
