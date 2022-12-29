package com.experian.experianapi.entity;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Document(collection ="customer")
public class CustomerDetailsEntity implements Serializable {
    @Id
    protected String id;
    protected CardDetailsEntity cardDetailsEntity;
    protected String creditScore;
    protected String cardNumber;

}
