package com.experian.experianapi.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Document(collection ="card_details")
public class CardDetailsEntity implements Serializable {
    @Id
    protected String id;
    protected String cardNumber;
    protected LocalDate expDate;
    protected int cvv;
    protected String cardType;
}
