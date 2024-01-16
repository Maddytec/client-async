package br.com.maddytec.service.impl;

import br.com.maddytec.client.QueueClient;
import br.com.maddytec.controller.request.ClienteRegisterRequest;
import br.com.maddytec.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {

    private final QueueClient queueClient;

    @Value("${queue.client.register}")
    private String queue;

    @Override
    public void register(ClienteRegisterRequest clienteRegisterRequest) {
        queueClient.send(this.queue, clienteRegisterRequest);
    }
}
