package com.proiect_kafka_redis.proiect_kafka_redis.kafka;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

	@Bean
	public JobDetail kafkaJobDet() {
		return JobBuilder.newJob(KafkaEventJob.class)
				.withIdentity("kafkaJob")
				.storeDurably()
				.build();
	}
	
	@Bean
	public Trigger kafkaTrigger(JobDetail kafkaJobDet) {
		return TriggerBuilder.newTrigger()
				.forJob(kafkaJobDet)
				.withIdentity("kafkaTrigger")
				.withSchedule(
						CronScheduleBuilder.cronSchedule("0 */15 * * * ?")
				)
				.build();
	}
	
}
