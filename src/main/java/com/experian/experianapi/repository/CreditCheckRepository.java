package com.experian.experianapi.repository;

import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.entity.CustomerDetailsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCheckRepository extends MongoRepository<CustomerDetails, String> {

   CustomerDetailsEntity getCustomerDetailsEntitiesByCardNumber(String cardNo);

}
