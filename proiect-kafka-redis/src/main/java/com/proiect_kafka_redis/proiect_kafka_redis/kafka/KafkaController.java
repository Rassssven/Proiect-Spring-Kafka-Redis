package com.proiect_kafka_redis.proiect_kafka_redis.kafka;

import java.time.Instant;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {
	
	private final EventProducer prod;
	
	public KafkaController(EventProducer prod) {
		this.prod = prod;
	}
	
	@PostMapping("/first-button")
	public void firstButton() {
		prod.sendEvent(new KafkaEvent(
				"Button number 1",
				"First button was pressed!",
				Instant.now().toString()
				)
			);
	}
	
	@PostMapping("/second-button")
	public void secondButton() {
		prod.sendEvent(new KafkaEvent(
				"Button number 2",
				"Second button was pressed!",
				Instant.now().toString()
				)
			);
	}
	
}
