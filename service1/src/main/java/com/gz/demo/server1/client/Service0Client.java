package com.gz.demo.server1.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by georgezou on 17/2/22.
 */
@FeignClient("service0")
public interface Service0Client {
    @RequestMapping(method = RequestMethod.GET, path = "test")
    String test();
}
