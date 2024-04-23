package com.jfb.cleanarchitecture.dataprovider.repository.mapper;

import com.jfb.cleanarchitecture.core.domain.Customer;
import com.jfb.cleanarchitecture.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
