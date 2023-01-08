package com.experian.experianapi.service;

import com.experian.experianapi.dto.CustomerDetails;
import org.springframework.stereotype.Service;

@Service
public interface CreditCheckService {
    public CustomerDetails getCustomerDetails(CustomerDetails customerDetails);

    public void createCustomer(CustomerDetails customerDetails);

}
