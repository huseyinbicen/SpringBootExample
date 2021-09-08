package com.huse.springbootexample.dto;

import com.huse.springbootexample.domain.Customer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class CustomerDTO {

    private String name;
    private String surname;
    private String identityId;
    private LocalDate birthday;

    public CustomerDTO() {
    }

    public CustomerDTO(Customer customer) {
        this.name = customer.getName();
        this.surname = customer.getSurname();
        this.identityId = customer.getIdentityId();
        this.birthday = customer.getBirthday();
    }
}
