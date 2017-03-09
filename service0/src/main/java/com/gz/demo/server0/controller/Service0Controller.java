package com.gz.demo.server0.controller;

import org.apache.commons.lang.time.FastDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by georgezou on 17/2/22.
 */
@RestController
public class Service0Controller {

//    FastDateFormat format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss");

    @GetMapping("/test")
    String test () {
        return "data";//FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
    }
}
