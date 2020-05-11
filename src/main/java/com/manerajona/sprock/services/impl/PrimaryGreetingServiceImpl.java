package com.manerajona.sprock.services.impl;

import com.manerajona.sprock.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hi there, I'm primary!";
    }
}
