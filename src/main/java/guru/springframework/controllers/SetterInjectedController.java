package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public GreetingService getGreetingService() {
		return greetingService;
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	

}
