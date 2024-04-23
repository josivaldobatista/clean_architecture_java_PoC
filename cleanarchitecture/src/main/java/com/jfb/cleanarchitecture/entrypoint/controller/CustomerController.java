package com.jfb.cleanarchitecture.entrypoint.controller;

import com.jfb.cleanarchitecture.core.domain.Customer;
import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase;
import com.jfb.cleanarchitecture.core.usecase.InsertCustomerUseCase;
import com.jfb.cleanarchitecture.entrypoint.controller.mapper.CustomerMapper;
import com.jfb.cleanarchitecture.entrypoint.controller.request.CustomerRequest;
import com.jfb.cleanarchitecture.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        Customer customer = findCustomerByIdUseCase.findById(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
}
