package com.delivery.delivery_app.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopic {

	@Bean
	public NewTopic deliveryLocationTopic() {
		return new NewTopic("delivery-location-update", 1, (short) 1);
	}
	
}
