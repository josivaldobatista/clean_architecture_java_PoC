package com.jfb.cleanarchitecture.entrypoint.controller.mapper;

import com.jfb.cleanarchitecture.core.domain.Customer;
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "string")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpfCnpj", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}