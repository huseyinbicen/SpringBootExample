package com.huse.springbootexample.api.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class SaveCustomerRequest {

    private String name;
    private String surname;
    private String identityId;
    private LocalDate birthday;
}
