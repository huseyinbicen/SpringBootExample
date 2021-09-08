package com.huse.springbootexample.api.constants;

import org.springframework.http.MediaType;

public class ApiEndpoints {

    public static final String RESPONSE_CONTENT_TYPE = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8";

    public static final String API_BASE_URL = "/api";
    public static final String VERSION_1_API_BASE_URL = API_BASE_URL + "/v1";

    public static final String CUSTOMER_API_URL = VERSION_1_API_BASE_URL + "/mail";

    public static final class CustomerService {
        public static final String NAME = "customer-api";
        public static final String TITLE = "CustomerApi";
        public static final String DESC = "Customer Api";
        public static final String PATHS = "/api/v1/customer/**";

        private CustomerService() {

        }
    }

    private ApiEndpoints() {

    }
}
