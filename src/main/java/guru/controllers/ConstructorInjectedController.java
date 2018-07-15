package guru.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

/**
 * 
 * @author praveen-vp 07-Jul-2018
 *
 */
@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImp") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
