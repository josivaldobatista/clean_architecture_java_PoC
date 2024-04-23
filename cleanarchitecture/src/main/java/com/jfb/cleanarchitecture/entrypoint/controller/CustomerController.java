package com.jfb.cleanarchitecture.entrypoint.controller;

import com.jfb.cleanarchitecture.core.usecase.InsertCustomerUseCase;
import com.jfb.cleanarchitecture.entrypoint.controller.mapper.CustomerMapper;
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}
