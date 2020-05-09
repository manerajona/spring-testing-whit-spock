package com.manerajona.sprock.controllers

import com.manerajona.sprock.UnitTest
import com.manerajona.sprock.services.GreetingServiceImpl
import org.junit.experimental.categories.Category
import spock.lang.Specification

@Category(UnitTest.class)
class ConstructorInjectedControllerTest extends Specification {

    ConstructorInjectedController controller

    def setup() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl())
    }

    def "GetGreetingService"() {
        println 'Running GetGreetingService...'

        expect: 'Should return the correct message'
        controller.getGreetingService().sayHello() == 'Hi there!'
    }
}
