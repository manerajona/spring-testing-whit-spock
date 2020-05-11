package com.manerajona.sprock.controllers

import com.manerajona.sprock.UnitTest
import com.manerajona.sprock.services.impl.PrimaryGreetingServiceImpl
import org.junit.experimental.categories.Category
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Category(UnitTest.class)
class MyControllerTest extends Specification {

    @Autowired
    MyController controller

    def setup() {
        controller = new MyController(new PrimaryGreetingServiceImpl())
    }

    def "Say hello"() {
        println 'Running Say hello...'

        expect: 'Should return the correct message'
        controller.sayHello() == "Hi there, I'm primary!"
    }
}
