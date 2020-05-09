package com.manerajona.sprock;

import com.manerajona.sprock.controllers.MyController;
import com.manerajona.sprock.controllers.PropertyInjectedController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = org.springframework.boot.SpringApplication.run(SpringApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());
	}

}
