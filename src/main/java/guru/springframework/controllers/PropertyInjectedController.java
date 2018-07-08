package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImp;

public class PropertyInjectedController {

	public GreetingServiceImp greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}
}
