package com.jfb.cleanarchitecture.entrypoint.controller.request;

import com.jfb.cleanarchitecture.core.domain.Address;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {

    @NotBlank
    private String nome;
    @NotBlank
    private String cpfCnpj;
    @NotBlank
    private String zipCode;
}
