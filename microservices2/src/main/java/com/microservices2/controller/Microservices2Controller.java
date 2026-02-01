package com.microservices2.controller;

import com.microservices2.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservices2Controller {

    @Autowired
    private Client client;

  //  @GetMapping("/ms2")
   // public String callMicroservices1(){
   //  return  client.getData();

  //  }

    @GetMapping("/ms2")
    public String getInformation(){
      return "I AM FROM MICROSERVICES 2" ;
    }
}
