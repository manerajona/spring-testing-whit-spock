package com.manerajona.sprock.controllers;

import com.manerajona.sprock.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("greetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreetings() {
        return greetingService.sayHello();
    }
}
