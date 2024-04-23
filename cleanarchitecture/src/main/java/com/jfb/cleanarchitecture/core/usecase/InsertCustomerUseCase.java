package com.jfb.cleanarchitecture.core.usecase;

import com.jfb.cleanarchitecture.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
