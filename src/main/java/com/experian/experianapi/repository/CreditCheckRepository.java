package com.experian.experianapi.repository;

import com.experian.experianapi.dto.CustomerDetails;
import com.experian.experianapi.entity.CustomerDetailsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCheckRepository extends MongoRepository<CustomerDetailsEntity, String> {

    CustomerDetailsEntity getCustomerDetailsEntitiesByCardNumber(String cardNo);

}
