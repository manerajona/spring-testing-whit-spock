package com.manerajona.sprock.controllers

import com.manerajona.sprock.UnitTest
import com.manerajona.sprock.services.GreetingServiceImpl
import org.junit.experimental.categories.Category
import spock.lang.Specification

@Category(UnitTest.class)
class SetterInjectedControllerTest extends Specification {

    SetterInjectedController controller

    def setup() {
        controller = new SetterInjectedController()
        controller.setGreetingService(new GreetingServiceImpl())
    }

    def "SetGreetingService"() {
        println 'Running SetGreetingService...'

        expect: 'Should return the correct message'
        controller.getGreetingService().sayHello() == 'Hi there!'
    }
}
