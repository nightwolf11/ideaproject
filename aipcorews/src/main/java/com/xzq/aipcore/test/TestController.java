package com.xzq.aipcore.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("")
    public String test(){

        return "Welcome to AIPCoreWS!";
    }

}
