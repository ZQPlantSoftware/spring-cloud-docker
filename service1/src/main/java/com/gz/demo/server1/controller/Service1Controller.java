package com.gz.demo.server1.controller;

import com.gz.demo.server1.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by georgezou on 17/2/22.
 */
@RestController
public class Service1Controller {
    @Autowired
    Service0Client service0Client;

    @GetMapping("/test")
    public String test() {
        return service0Client.test();
    }
}
