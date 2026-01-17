package com.proiect_kafka_redis.proiect_kafka_redis.db;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class EventEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String contents;
	private LocalDateTime dateOfCreation;
	
	public EventEntity() {}
	
	public EventEntity(String contents) {
		this.contents = contents;
		this.dateOfCreation = LocalDateTime.now();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public LocalDateTime getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(LocalDateTime dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	@Override
	public String toString() {
		return "EventEntity [id=" + id + ", contents=" + contents + ", dateOfCreation=" + dateOfCreation + "]";
	}

}
