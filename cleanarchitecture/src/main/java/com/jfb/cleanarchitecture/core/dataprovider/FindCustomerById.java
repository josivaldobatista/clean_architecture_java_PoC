package com.jfb.cleanarchitecture.core.dataprovider;

import com.jfb.cleanarchitecture.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> findById(final String id);
}
