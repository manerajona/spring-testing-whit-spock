package com.manerajona.sprock;

import com.manerajona.sprock.controllers.I18nController;
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

		I18nController i18n = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18n.sayGreeting());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());
	}

}
