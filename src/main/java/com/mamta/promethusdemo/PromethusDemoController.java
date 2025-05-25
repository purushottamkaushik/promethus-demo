package com.mamta.promethusdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Slf4j
public class PromethusDemoController {

    @GetMapping
    public String getData(){
        log.debug("Gettting data.... ");
        return "Hello";
    }

}
