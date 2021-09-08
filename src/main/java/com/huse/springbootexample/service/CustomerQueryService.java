package com.huse.springbootexample.service;

import com.huse.springbootexample.dto.CustomerDTO;

public interface CustomerQueryService {

    CustomerDTO getCustomerByIdentityId(String identityId);
}
