package com.proiect_kafka_redis.proiect_kafka_redis.camunda;

import java.util.Map;

import org.camunda.bpm.engine.DecisionService;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

	private final DecisionService dServ;
	
	public DeliveryService(DecisionService dServ) {
		this.dServ = dServ;
	}
	
	public String getDeliveryType(double distance, double orderValue) {
		
		var result = dServ
				.evaluateDecisionByKey("deliveryTypeDecision")
				.variables(Map.of(
						"distance", distance,
						"orderValue", orderValue
				))
				.evaluate();
		
		return result.getSingleResult().getSingleEntry();
	}
	
}
