This project is a full-stack distributed application built using modern enterprise technologies.
It provides workflow orchestration, messaging, caching and scheduled task execution.

  Arhitecture overview:

  - Backend: Spring Boot
  - Frontend: Angular SPA
  - Messaging: Apache Kafka
  - Caching: Redis
  - Wokflow Engine: Camunda BPM
  - Scheduling: Quartz Scheduler
  - Logging: Log4j2

This project simulates a modern online ordering and order-tracking platform, inspired by systems used in real-world delivery applications.


  Messaging (Kafka)

Kafka is used for event-driven communication between services.
    - src/main/java/Kafka

  Caching (Redis)

Used for caching frequently accessed data, session storage and distributed locks.
    - src/main/java/Redis

  Scheduling (Quartz)

Quartz is used for scheduled jobs.
    - src/main/java/Kafka/quartzConfig

  Workflow (Camunda)

Camunda is used to orchestrate business processes and decision rules.
    - src/main/resources/camunda_rule.dmn


  How to run the project:

  - git clone https://github.com/Proiect-Spring-Kafa-Redis.git
  - Start the infrastructure:
      - Make sure the following are running: Kafka and Redis
  - Start backend: mvn spring-boot:run
  - Star frontend: npm install / npm start

