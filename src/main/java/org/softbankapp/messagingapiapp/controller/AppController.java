package org.softbankapp.messagingapiapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/Oracle")
    public String printGreeting() {
        return "Hello Oracle!";
    }
    @GetMapping
    public String guest() {
        return "Hello Guest!";
    }


}
