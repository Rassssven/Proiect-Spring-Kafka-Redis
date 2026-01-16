package com.proiect_kafka_redis.proiect_kafka_redis.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

@Configuration
public class RedisConfig {
	
	@Bean
	public RedisTemplate<String, Object> redisTemp(RedisConnectionFactory fac) {
		RedisTemplate<String, Object> temp = new RedisTemplate<>();
		temp.setConnectionFactory(fac);
		
		temp.setKeySerializer(new StringRedisSerializer());
		temp.setValueSerializer(new GenericJackson2JsonRedisSerializer());
		
		return temp;
	}
	
}
