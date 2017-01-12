package com.SpringRestApplication.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 12-Jan-17.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {

        return "Hi";
    }
}
