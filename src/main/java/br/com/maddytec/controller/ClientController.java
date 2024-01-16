package br.com.maddytec.controller;

import br.com.maddytec.controller.request.ClienteRegisterRequest;
import br.com.maddytec.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/client")
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public void clientRegister(@RequestBody ClienteRegisterRequest clienteRegisterRequest) {
        clientService.register(clienteRegisterRequest);
    }
}
