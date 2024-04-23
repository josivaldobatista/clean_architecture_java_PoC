package com.jfb.cleanarchitecture.dataprovider;

import com.jfb.cleanarchitecture.core.dataprovider.FindAddressByZipCode;
import com.jfb.cleanarchitecture.core.domain.Address;
import com.jfb.cleanarchitecture.dataprovider.client.FindAddressByZipCodeClient;
import com.jfb.cleanarchitecture.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
