package com.experian.experianapi.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class CustomerDetails {

    private CardDetails cardDetails;
    private String creditScore;
    private String cardNumber;
}
