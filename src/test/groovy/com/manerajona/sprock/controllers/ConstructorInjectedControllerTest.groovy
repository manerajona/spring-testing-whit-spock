package com.manerajona.sprock.controllers

import com.manerajona.sprock.UnitTest
import com.manerajona.sprock.services.impl.ConstructorGreetingServiceImpl
import org.junit.experimental.categories.Category
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Category(UnitTest.class)
class ConstructorInjectedControllerTest extends Specification {

    @Autowired
    ConstructorInjectedController controller

    def setup() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl())
    }

    def "Get greetings"() {
        println 'Running GetGreetings...'

        expect: 'Should return the correct message'
        controller.getGreeting() == 'Hello there!'
    }
}
