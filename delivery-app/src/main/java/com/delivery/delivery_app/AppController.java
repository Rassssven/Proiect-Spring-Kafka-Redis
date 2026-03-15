package com.delivery.delivery_app;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.delivery_app.Events.DeliveryLocationUpdatedEvent;
import com.delivery.delivery_app.Events.DeliveryRoute;
import com.delivery.delivery_app.kafka.KafkaDeliveryProducer;

@RestController
@RequestMapping("/simulator")
public class AppController {

	private final DeliveryRoute d1 = new DeliveryRoute();
	private final KafkaDeliveryProducer prod;
	
	public AppController(KafkaDeliveryProducer prod) {
		this.prod = prod;
	}
	
	@PostMapping("/move")
	public String getMovement() {
		
		double[] loc = d1.nextLoc();
		
		DeliveryLocationUpdatedEvent ev = new DeliveryLocationUpdatedEvent(1L, 1L, loc[0], loc[1], LocalDateTime.now());
		
		prod.sendUpdatedLocation(ev);
		
		return "Event update sent! ";
		
	}
	
}
