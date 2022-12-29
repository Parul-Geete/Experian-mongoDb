package com.experian.experianapi.service;

import com.experian.experianapi.dto.CardDetails;
import com.experian.experianapi.dto.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public interface CreditCheckService {
    public CustomerDetails getCustomerDetails(CustomerDetails customerDetails);
    public void createCustomer(CustomerDetails customerDetails);

}
