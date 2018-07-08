package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImp;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingServiceImp greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
