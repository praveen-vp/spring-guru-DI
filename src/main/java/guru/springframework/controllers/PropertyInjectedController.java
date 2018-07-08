package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("greetingServiceImp")
	public GreetingService greetingServiceImp;

	public String sayHello() {
		return greetingServiceImp.sayGreeting();
	}
}
