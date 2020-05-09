package com.manerajona.sprock.controllers

import com.manerajona.sprock.UnitTest
import org.junit.experimental.categories.Category
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Category(UnitTest.class)
class MyControllerTest extends Specification {

    @Autowired
    MyController controller

    def setup() {
        controller = new MyController()
    }

    def "GetGreetingService"() {
        println 'Running GetGreetingService...'

        expect: 'Should return the correct message'
        controller.sayHello() == 'Hi folks'
    }
}
