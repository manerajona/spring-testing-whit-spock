package com.manerajona.sprock.controllers

import com.manerajona.sprock.UnitTest
import com.manerajona.sprock.services.GreetingServiceImpl
import org.junit.experimental.categories.Category
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Category(UnitTest.class)
class PropertyInjectedControllerTest extends Specification {

    @Autowired
    def controller

    def setup() {
        controller = new PropertyInjectedController()
        controller.greetingService = new GreetingServiceImpl()
    }

    def "Get greetings"() {
        println 'Running GetGreetings...'

        expect: 'Should return the correct message'
        controller.getGreetings() == 'Hi there!'
    }
}
