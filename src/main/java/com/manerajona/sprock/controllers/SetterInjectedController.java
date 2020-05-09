package com.manerajona.sprock.controllers;

import com.manerajona.sprock.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
