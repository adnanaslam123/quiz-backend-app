package com.quiz.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class QuizSocketHandler extends TextWebSocketHandler {
    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        session.sendMessage(new TextMessage("Real-time question: What is JVM?"
        		+ "A. Java Virtual Machine"
        		+ "B. Java Volatile Method"
        		+ "C. Just Very Mad"
        		+ "D. None"));
    }
}
