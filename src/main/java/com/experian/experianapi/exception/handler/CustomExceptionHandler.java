package com.experian.experianapi.exception.handler;


import com.experian.experianapi.error.Error;
import com.experian.experianapi.exception.ExperianCustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ExperianCustomException.class)
     public ResponseEntity<Object> experianCustomExceptionHandler(){
        Error error = new Error();
        error.setErrorCode(100);
        error.setMessage("Downstream service error");
        error.setTime(LocalDate.from(LocalDateTime.now()));
        ResponseEntity<Object> responseEntity = new ResponseEntity(error, HttpStatus.BAD_REQUEST);

        return null;
    }

}
