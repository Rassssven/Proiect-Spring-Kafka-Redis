package com.delivery.delivery_app.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestData {

	@Bean
	CommandLineRunner loadData(
			UserRepository userRepo,
			CourierRepository courierRepo,
			DeliveryRepository delRepo) {
		
		return ar -> {
			
			User u1 = new User("Alex", "alex@gmail.com", "Calea Victoriei 20");
			userRepo.save(u1);
			
			Courier c1 = new Courier("Andrei Rider", "Motorcycle");
			courierRepo.save(c1);
			
			Delivery d1 = new Delivery(u1, c1, "ON_ROUTE");
			delRepo.save(d1);
			
			System.out.println("Data for test created. Delievry id: " + d1.getId());
		};
		
	}
	
}
