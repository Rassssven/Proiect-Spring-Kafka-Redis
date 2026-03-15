package com.delivery.delivery_app.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.delivery.delivery_app.Events.DeliveryLocationUpdatedEvent;

@Service
public class KafkaDeliveryProducer {

	private final KafkaTemplate<String, DeliveryLocationUpdatedEvent> kafkaTemp;

	public KafkaDeliveryProducer(KafkaTemplate<String, DeliveryLocationUpdatedEvent> kafkaTemp) {
		super();
		this.kafkaTemp = kafkaTemp;
	}
	
	public void sendUpdatedLocation(DeliveryLocationUpdatedEvent ev) {
		kafkaTemp.send("delivery-location-update", ev.getDeliveryId().toString(), ev);
	}
	
}
