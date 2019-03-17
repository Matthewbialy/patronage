package com.crud.intive.controller;

import com.crud.intive.domain.Database;
import com.crud.intive.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/intive/iss")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(method = RequestMethod.GET, value = "VELOCITY", consumes = APPLICATION_JSON_VALUE)
    public List<Database> velocityValue (@RequestBody Database database) {
        return new ArrayList<>();

    }
    @RequestMapping(method = RequestMethod.GET, value = "DISTANCE", consumes = APPLICATION_JSON_VALUE)
    public List<Database> distanceValue(@RequestBody Database database) {
        return new ArrayList<>();
    }
}
