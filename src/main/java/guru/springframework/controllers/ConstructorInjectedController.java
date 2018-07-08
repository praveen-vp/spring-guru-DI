package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * 
 * @author praveen-vp 07-Jul-2018
 *
 */
public class ConstructorInjectedController {

	private GreetingService greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
