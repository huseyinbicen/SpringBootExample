package com.huse.springbootexample.repository;

import com.huse.springbootexample.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findOneByIdentityId(String identityId);
}
