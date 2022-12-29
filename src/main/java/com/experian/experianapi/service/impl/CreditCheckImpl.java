package com.experian.experianapi.service.impl;

import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.entity.CustomerDetailsEntity;
import com.experian.experianapi.exception.ExperianCustomException;
import com.experian.experianapi.repository.CreditCheckRepository;
import com.experian.experianapi.service.CreditCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreditCheckImpl implements CreditCheckService {
    private final Logger LOG = LoggerFactory.getLogger(CreditCheckImpl.class);
    @Autowired
    private CreditCheckRepository creditCheckRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public CustomerDetails getCustomerDetails(CustomerDetails customerDetails) {

        CustomerDetailsEntity custDetails = creditCheckRepository.getCustomerDetailsEntitiesByCardNumber(customerDetails.getCardNumber());
        try {
            customerDetails.setCreditScore(custDetails.getCreditScore());
            LOG.info("creditScore updated");
        } catch (Exception e) {
            LOG.error("exception credit-score service error: {}", e.getMessage());
            throw new ExperianCustomException("Exception in experian credit-score service call");
        }
        return customerDetails;

    }

    @Override
    public void createCustomer(CustomerDetails customerDetails) {
        try {
            LOG.info("customer-details created");
            mongoTemplate.save(customerDetails);
        } catch (Exception e) {
            LOG.error("exception in create customer service error: {}", e.getMessage());
            throw new ExperianCustomException("Exception in experian create customer service call");
        }

    }

}
