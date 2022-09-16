package com.politecnico.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api")
public class ApiRest {

    Logger logger = LoggerFactory.getLogger(ApiRest.class);

    @Value ("${message.response}")
    private String message;

    @GetMapping
    public ResponseEntity<Object> get() {
        logger.info("--- http request get ---");
        return ResponseEntity.status(200).body(message);
    }
}
