package com.experian.experianapi;

import com.experian.experianapi.repository.CreditCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class ExperianApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperianApplication.class, args);
	}

}
