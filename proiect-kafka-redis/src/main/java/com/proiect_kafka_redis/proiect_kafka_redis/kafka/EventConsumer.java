package com.proiect_kafka_redis.proiect_kafka_redis.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.proiect_kafka_redis.proiect_kafka_redis.redis.RedisEventService;

@Service
public class EventConsumer {
	
	private final RedisEventService redisEv;

	public EventConsumer(RedisEventService redisEv) {
		this.redisEv = redisEv;
	}
	
	@KafkaListener(
			topics = "test-event",
			groupId = "spring-prj-group"
	)
	public void consumer(KafkaEvent event) {
		System.out.println("Event from Kafka: " + event);
		
		redisEv.saveLast(event);
	}
	
	
}
