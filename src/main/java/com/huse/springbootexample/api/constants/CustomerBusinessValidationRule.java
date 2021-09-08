package com.huse.springbootexample.api.constants;

public enum CustomerBusinessValidationRule {
    EMAIL_EMPTY("E-mail cannot be empty"),
    VALIDATION_E_MAIL("E-Mail address could not be verified"),
    VALIDATION_PHONE_NUMBER("Phone number could not be verified");
    private String description;

    private CustomerBusinessValidationRule(String description) {
        this.description = description;
    }

    public String getCode() {
        return name();
    }

    public String getDescription() {
        return description;
    }
}
