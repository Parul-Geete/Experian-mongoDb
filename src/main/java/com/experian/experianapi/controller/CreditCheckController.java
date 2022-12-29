package com.experian.experianapi.controller;


import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.service.CreditCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCheckController {

    private final Logger LOG = LoggerFactory.getLogger(CreditCheckController.class);
    @Autowired
    private CreditCheckService creditCheckService;

    @GetMapping("/customerDetails")
    public CustomerDetails getCustomerDetails(@RequestBody CustomerDetails customerDetails) {
        LOG.info("customerDetails updated");
        return creditCheckService.getCustomerDetails(customerDetails);
    }
    @PostMapping ("/create")
    public CustomerDetails createCustomer(@RequestBody CustomerDetails customerDetails){
        creditCheckService.createCustomer(customerDetails);
        return customerDetails;
    }
}
