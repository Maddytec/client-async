package br.com.maddytec.client;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class QueueClient {

    private final RabbitTemplate rabbitTemplate;

    public void send(String queue, Object object) {
        rabbitTemplate.convertAndSend(queue, object);
    }
}