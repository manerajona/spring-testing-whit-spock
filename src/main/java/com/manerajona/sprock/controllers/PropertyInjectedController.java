package com.manerajona.sprock.controllers;

import com.manerajona.sprock.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreetings() {
        return greetingService.sayHello();
    }
}
