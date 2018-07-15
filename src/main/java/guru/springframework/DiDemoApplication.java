package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.controllers.ConstructorInjectedController;
import guru.controllers.MyController;
import guru.controllers.PropertyInjectedController;
import guru.controllers.SetterInjectedController;

/**
 * 
 * @author praveen-vp 08-Jul-2018
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"guru.controllers", "guru.springframework.services"})
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

	}
}
