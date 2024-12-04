package com.billing.vmr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vmr")
public class BillingController {

    @GetMapping("/hello")
    public String getAllQuotation(){
        return "Hello World";

    }
}
