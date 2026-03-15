package com.delivery.delivery_app.Events;

import java.time.LocalDateTime;

public class DeliveryLocationUpdatedEvent {

	private Long deliveryId;
	private Long courierId;
	private double lat;
	private double lng;
	private LocalDateTime timestamp;
	
	public DeliveryLocationUpdatedEvent(Long deliveryId, Long courierId, double lat, double lng,
			LocalDateTime timestamp) {
		super();
		this.deliveryId = deliveryId;
		this.courierId = courierId;
		this.lat = lat;
		this.lng = lng;
		this.timestamp = timestamp;
	}

	public Long getDeliveryId() {
		return deliveryId;
	}

	public Long getCourierId() {
		return courierId;
	}

	public double getLat() {
		return lat;
	}

	public double getLng() {
		return lng;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	
	
}
