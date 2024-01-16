package br.com.maddytec.listener;

import br.com.maddytec.controller.request.ClienteRegisterRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ClientListener {

    private static final Logger log = LoggerFactory.getLogger(Class.class.getName());

    @RabbitListener(queues = "${queue.client.register}")
    public void clientRegister(ClienteRegisterRequest clienteRegisterRequest) {
        log.info("Message: {}", clienteRegisterRequest);
    }
}
