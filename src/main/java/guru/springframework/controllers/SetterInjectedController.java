package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;
/**
 * 
 * @author praveen-vp
 * 08-Jul-2018
 *
 */
@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Autowired
	public void setGreetingService(@Qualifier("setterGreetingServiceImp") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	

}
