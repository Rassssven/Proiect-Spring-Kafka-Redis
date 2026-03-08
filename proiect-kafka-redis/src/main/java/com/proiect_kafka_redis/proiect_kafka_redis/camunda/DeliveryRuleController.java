package com.proiect_kafka_redis.proiect_kafka_redis.camunda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryRuleController {

	private final DeliveryService dServ;
	
	public DeliveryRuleController(DeliveryService dServ) {
		this.dServ = dServ;
	}
	
	@GetMapping("/verify")
	public String getDeliveryType(@RequestParam double distance, @RequestParam double orderValue) {
		return dServ.getDeliveryType(distance, orderValue);
	}
	
}
