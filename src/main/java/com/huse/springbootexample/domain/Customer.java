package com.huse.springbootexample.domain;

import com.huse.springbootexample.api.request.SaveCustomerRequest;
import com.huse.springbootexample.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Where(clause = BaseEntity.SOFT_DELETE_CLAUSE)
public class Customer extends BaseEntity {
    private String name;
    private String surname;
    private String identityId;
    private LocalDate birthday;

    public Customer() {
    }

    public Customer(SaveCustomerRequest request) {
        this.name = request.getName();
        this.surname = request.getSurname();
        this.identityId = request.getIdentityId();
        this.birthday = request.getBirthday();
    }
}
