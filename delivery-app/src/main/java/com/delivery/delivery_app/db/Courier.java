package com.delivery.delivery_app.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="couriers")
public class Courier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String vehicleType;
	
	public Courier() {
		
	}

	public Courier(int id, String name, String vehicleType) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleType = vehicleType;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getVehicleType() {
		return vehicleType;
	}
	
	
	
}
