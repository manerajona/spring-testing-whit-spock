package com.manerajona.sprock.services.impl;

import com.manerajona.sprock.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EngGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello world";
    }
}
