package com.crud.intive.controller;

import com.crud.intive.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/intive/iss")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(method = RequestMethod.GET, value = "velocity", consumes = APPLICATION_JSON_VALUE)
    public double velocityValue () {
        return service.calcVelocity();
    }

    @RequestMapping(method = RequestMethod.GET, value = "distance", consumes = APPLICATION_JSON_VALUE)
    public double distanceValue() {
        return service.calcDistance();
    }
}
