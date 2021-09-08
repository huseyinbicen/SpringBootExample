package com.huse.springbootexample.util;

import com.huse.springbootexample.api.constants.CustomerBusinessValidationRule;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

public class ValidationUtils {

    public ValidationUtils() {
    }

    public static String verifyEmail(String eMail) {
        if (StringUtils.isEmpty(eMail)) {
            return CustomerBusinessValidationRule.EMAIL_EMPTY.getCode();
        } else {
            String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
            if (!eMail.matches(regex))
                return CustomerBusinessValidationRule.VALIDATION_E_MAIL.getCode();
        }
        return StringUtils.EMPTY;
    }

    public static String verifyPhone(String phone) {
        if (phone != null && NumberUtils.isDigits(phone) && phone.length() == 10)
            return StringUtils.EMPTY;

        return CustomerBusinessValidationRule.VALIDATION_PHONE_NUMBER.getCode();
    }
}
