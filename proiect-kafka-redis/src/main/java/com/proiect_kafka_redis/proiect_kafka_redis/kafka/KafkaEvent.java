package com.proiect_kafka_redis.proiect_kafka_redis.kafka;

import java.time.Instant;

public class KafkaEvent {
	private String type;
	private String contents;
	private String date;
	
	public KafkaEvent() {}
	
	public KafkaEvent(String type, String contents, String date) {
		super();
		this.type = type;
		this.contents = contents;
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "kafkaEvent [type=" + type + ", contents=" + contents + ", date=" + date + "]";
	}
	
}
