package com.jfb.cleanarchitecture.core.usecase.impl;

import com.jfb.cleanarchitecture.core.dataprovider.FindCustomerById;
import com.jfb.cleanarchitecture.core.domain.Customer;
import com.jfb.cleanarchitecture.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer findById(String id) {
        return findCustomerById.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
