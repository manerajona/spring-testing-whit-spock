package com.manerajona.sprock.services.impl;

import com.manerajona.sprock.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello there!";
    }
}
