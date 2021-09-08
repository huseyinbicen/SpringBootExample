package com.huse.springbootexample.service;

import com.huse.springbootexample.api.request.SaveCustomerRequest;

public interface CustomerCommandService {

    Long saveCustomer(SaveCustomerRequest request);
}
