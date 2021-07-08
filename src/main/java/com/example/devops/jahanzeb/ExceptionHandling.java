package com.example.devops.jahanzeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHandling extends ResponseEntityExceptionHandler {

    Logger logger = LoggerFactory.getLogger(ExceptionHandling.class);

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String name = ex.getParameterName();

        String message =  name.equals ("tags")?"Tags parameter is required":name+"parameter is required";

        Map<String,String> response = new HashMap<> ();
        response.put ("error",message);

        logger.error (message);
        return new ResponseEntity<> (response,HttpStatus.BAD_REQUEST);
    }
}

