package com.huse.springbootexample.service.impl;

import com.huse.springbootexample.api.request.SaveCustomerRequest;
import com.huse.springbootexample.domain.Customer;
import com.huse.springbootexample.repository.CustomerRepository;
import com.huse.springbootexample.service.CustomerCommandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerCommandServiceImpl implements CustomerCommandService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCommandServiceImpl.class.getSimpleName());

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Long saveCustomer(SaveCustomerRequest request) {
        try {
            Customer customer = new Customer(request);
            return customerRepository.save(customer).getId();
        } catch (Exception e) {
            LOGGER.error("saveCustomer, request is: " + request, e);
            return 0L;
        }
    }
}
