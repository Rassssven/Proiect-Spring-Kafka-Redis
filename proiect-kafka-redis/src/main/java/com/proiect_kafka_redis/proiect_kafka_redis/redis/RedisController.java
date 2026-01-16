package com.proiect_kafka_redis.proiect_kafka_redis.redis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proiect_kafka_redis.proiect_kafka_redis.kafka.KafkaEvent;

@RestController
public class RedisController {
	
	private final RedisEventService redisEv;

	public RedisController(RedisEventService redisEv) {
		this.redisEv = redisEv;
	}
	
	@GetMapping("/api/last-event")
	public KafkaEvent getLastEvent() {
		return redisEv.getLastEvent();
	}
	
}
