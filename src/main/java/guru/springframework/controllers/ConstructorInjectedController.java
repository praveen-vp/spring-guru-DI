package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
