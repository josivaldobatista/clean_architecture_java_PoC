package com.jfb.cleanarchitecture.dataprovider;

import com.jfb.cleanarchitecture.core.dataprovider.InsertCustomer;
import com.jfb.cleanarchitecture.core.domain.Customer;
import com.jfb.cleanarchitecture.dataprovider.repository.CustomerRepository;
import com.jfb.cleanarchitecture.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
