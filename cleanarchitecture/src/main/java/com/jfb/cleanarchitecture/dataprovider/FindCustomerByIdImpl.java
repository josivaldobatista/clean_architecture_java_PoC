package com.jfb.cleanarchitecture.dataprovider;

import com.jfb.cleanarchitecture.core.dataprovider.FindCustomerById;
import com.jfb.cleanarchitecture.core.domain.Customer;
import com.jfb.cleanarchitecture.dataprovider.repository.CustomerRepository;
import com.jfb.cleanarchitecture.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> findById(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
