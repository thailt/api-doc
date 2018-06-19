package com.egs.apidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(value = "/api/greeting", method = RequestMethod.GET)
    public String greeting() {
        return "hello";
    }

}
