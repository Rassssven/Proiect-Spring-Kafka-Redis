package com.proiect_kafka_redis.proiect_kafka_redis.websocket;

import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/app")
public class wsEndpoint {

	@OnOpen
	public void onOpen(Session sess) {
		System.out.println("Conexiunea s-a deschis: " + sess.getId());
	}
	
	@OnMessage
	public String onMessage(String message, Session sess) {
		System.out.println("Mesajul: " + message);
		return "Serverul a primit " + message;
	}
	
	@OnClose
	public void onClose(Session sess) {
		System.out.println("Conexiunea s-a inchis: " + sess.getId());
	}
	
	
}

