package com.proiect_kafka_redis.proiect_kafka_redis.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventProducer {
	
	private final KafkaTemplate<String, KafkaEvent> kafkaTemp;
	
	public EventProducer(KafkaTemplate<String, KafkaEvent> kafkaTemp) {
		this.kafkaTemp = kafkaTemp;
	}
	
	public void sendEvent(KafkaEvent event) {
		kafkaTemp.send("test-event", event);
	}
	
}
