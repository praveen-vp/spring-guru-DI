package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.services.GreetingServiceImp;

public class SetterInjectedDITest {

	private SetterInjectedController setterInjectedController;

	@Before
	public void setup() throws Exception {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImp());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImp.HELLO_GURU, this.setterInjectedController.sayHello());
	}
}
