package com.jfb.cleanarchitecture.core.dataprovider;

import com.jfb.cleanarchitecture.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
