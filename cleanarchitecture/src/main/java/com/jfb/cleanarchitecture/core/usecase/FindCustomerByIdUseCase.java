package com.jfb.cleanarchitecture.core.usecase;

import com.jfb.cleanarchitecture.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer findById(String id);
}
