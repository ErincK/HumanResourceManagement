package com.hrm.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    @Value("${rabbitmq.exchange-admin}")
    private String exchangeAdmin;
    @Value("${rabbitmq.queueAdminRegister}")
    private String registerAdminQueue;
    @Value("${rabbitmq.registerAdminBindingKey}")
    private String registerAdminBindingKey;
    @Bean
    DirectExchange exchangeRegisterAdmin(){
        return new DirectExchange(exchangeAdmin);
    }
    @Bean
    Queue registerAdminQueue(){
        return new Queue(registerAdminQueue);
    }
    @Bean
    public Binding registerAdminBindingKey(final Queue registerAdminQueue,final DirectExchange exchangeRegisterAdmin){
        return BindingBuilder.bind(registerAdminQueue).to(exchangeRegisterAdmin).with(registerAdminBindingKey);
    }

}
