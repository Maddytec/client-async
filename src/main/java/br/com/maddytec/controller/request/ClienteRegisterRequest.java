package br.com.maddytec.controller.request;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClienteRegisterRequest {
    private String name;
    private String cpf;

}
