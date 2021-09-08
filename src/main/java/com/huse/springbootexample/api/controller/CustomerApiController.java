package com.huse.springbootexample.api.controller;

import com.huse.springbootexample.api.constants.ApiEndpoints;
import com.huse.springbootexample.api.request.SaveCustomerRequest;
import com.huse.springbootexample.api.response.ResponseOfGet;
import com.huse.springbootexample.dto.CustomerDTO;
import com.huse.springbootexample.service.CustomerCommandService;
import com.huse.springbootexample.service.CustomerQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoints.CUSTOMER_API_URL, produces = ApiEndpoints.RESPONSE_CONTENT_TYPE, consumes = MediaType.APPLICATION_JSON_VALUE)
@Api(value = ApiEndpoints.CustomerService.NAME)
public class CustomerApiController {

    @Autowired
    private CustomerQueryService customerQueryService;

    @Autowired
    private CustomerCommandService customerCommandService;

    @GetMapping(value = "/test", consumes= {MediaType.ALL_VALUE})
    public ResponseOfGet<String> getTest() {
        return new ResponseOfGet<>("Hüseyin");
    }

    @GetMapping(value = "/get", consumes= {MediaType.ALL_VALUE})
    @ApiOperation(value = "Returns customer info", notes = "Queries by identityId")
    public ResponseOfGet<CustomerDTO> getCustomer(@RequestParam(value = "identityId", required = true) String identityId) {
        return new ResponseOfGet<>(customerQueryService.getCustomerByIdentityId(identityId));
    }

    @PostMapping(value = "/save")
    @ApiOperation(value = "Returns Record Id", notes = "Save by saveCustomerRequest")
    public ResponseOfGet<Long> saveCustomer(@RequestBody SaveCustomerRequest saveCustomerRequest) {
        return new ResponseOfGet<>(customerCommandService.saveCustomer(saveCustomerRequest));
    }
}
