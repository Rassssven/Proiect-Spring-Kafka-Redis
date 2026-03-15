package com.delivery.delivery_app.db;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="deliveries")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private User user;
	
	@ManyToOne 
	private Courier courier;
	
	private String status;
	
	private LocalDateTime createdAt;
	
	public Delivery() {
		
	}

	public Delivery(User user, Courier courier, String status) {
		super();
		this.user = user;
		this.courier = courier;
		this.status = status;
		this.createdAt = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public Courier getCourier() {
		return courier;
	}

	public String getStatus() {
		return status;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	
	
	
}
