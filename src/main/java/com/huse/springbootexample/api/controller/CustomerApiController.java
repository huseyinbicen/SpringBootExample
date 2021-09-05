package com.huse.springbootexample.api.controller;

import com.huse.springbootexample.api.response.ResponseOfGet;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerApiController {

    @GetMapping(value = "/test", produces={"application/json"}, consumes= {MediaType.ALL_VALUE})
    public ResponseOfGet<String> getTest() {
        return new ResponseOfGet<>("Hüseyin");
    }
}
