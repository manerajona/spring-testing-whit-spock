package com.manerajona.sprock.services.impl;

import com.manerajona.sprock.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpaGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola mundo";
    }
}
