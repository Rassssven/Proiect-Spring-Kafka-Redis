package com.delivery.delivery_app.kafka;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.delivery.delivery_app.Events.DeliveryLocationUpdatedEvent;

@Service
public class KafkaDeliveryConsumer {

	private final RedisTemplate<String, Object> redisTmp;

	public KafkaDeliveryConsumer(RedisTemplate<String, Object> redisTmp) {
		super();
		this.redisTmp = redisTmp;
	}
	
	@KafkaListener(
		topics = "delivery-location-update",
		groupId = "delivery-group"
	)
	public void takeLocation(DeliveryLocationUpdatedEvent ev) {
		String key = "delivery: " + ev.getDeliveryId() + ":current";
		
		redisTmp.opsForValue().set(key, ev);
		
		System.out.println("The location is: " + key);
	}
	
	
}
