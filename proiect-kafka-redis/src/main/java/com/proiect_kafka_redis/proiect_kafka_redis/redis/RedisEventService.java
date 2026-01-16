package com.proiect_kafka_redis.proiect_kafka_redis.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.proiect_kafka_redis.proiect_kafka_redis.kafka.KafkaEvent;

@Service
public class RedisEventService {
	
	private static final String lastEventKey = "last-button";
	
	private final RedisTemplate<String, Object> redisTemp;

	public RedisEventService(RedisTemplate<String, Object> redisTemp) {
		super();
		this.redisTemp = redisTemp;
	}
	
	public void saveLast(KafkaEvent event) {
		redisTemp.opsForValue().set(lastEventKey, event);
	}
	
	public KafkaEvent getLastEvent() {
		return (KafkaEvent) redisTemp.opsForValue().get(lastEventKey);
	}
	
	
}
