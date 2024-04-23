package com.jfb.cleanarchitecture.dataprovider.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;
    private String nome;
    private String cpfCnpj;
    private AddressEntity address;
    private Boolean isValidCpfCnpj;
}
