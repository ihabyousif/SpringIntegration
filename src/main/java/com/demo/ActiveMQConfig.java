package com.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import javax.jms.Queue;
 
@Configuration
public class ActiveMQConfig {
 
    public static final String ORDER_QUEUE = "order.queue";
 
    @Bean
    public Queue orderJMSQueue() {
        return new ActiveMQQueue(ORDER_QUEUE);
    }
}