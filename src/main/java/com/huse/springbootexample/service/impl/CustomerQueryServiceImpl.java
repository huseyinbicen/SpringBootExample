package com.huse.springbootexample.service.impl;

import com.huse.springbootexample.domain.Customer;
import com.huse.springbootexample.dto.CustomerDTO;
import com.huse.springbootexample.repository.CustomerRepository;
import com.huse.springbootexample.service.CustomerQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CustomerQueryServiceImpl implements CustomerQueryService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO getCustomerByIdentityId(String identityId) {
        Customer customer = customerRepository.findOneByIdentityId(identityId);
        return new CustomerDTO(customer);
    }
}
