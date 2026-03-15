package com.delivery.delivery_app.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracking")
public class RedisTrackingController {

	private final RedisTemplate<String, Object> redisTemp;
	
	public RedisTrackingController(RedisTemplate<String, Object> redisTemp) {
		this.redisTemp = redisTemp;
	}
	
	@GetMapping("/{deliveryId}")
	public Object trackDelivery(@PathVariable Long deliveryId) {
		String key = "delivery:" + deliveryId + ":current";
		
		return redisTemp.opsForValue().get(key);
	}
	
}
