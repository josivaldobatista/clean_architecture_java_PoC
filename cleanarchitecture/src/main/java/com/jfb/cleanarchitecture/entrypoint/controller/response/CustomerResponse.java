package com.jfb.cleanarchitecture.entrypoint.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {

    private String nome;
    private String cpfCnpj;
    private AddressResponse address;
    private Boolean isValidCpfCnpj;
}
