package com.proiect_kafka_redis.proiect_kafka_redis.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

}
