package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.controllers.PropertyInjectedController;
import guru.springframework.services.GreetingServiceImp;

public class PropertyInjectedDITest {

	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setup() throws Exception {

		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImp = new GreetingServiceImp();

	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImp.HELLO_GURU, this.propertyInjectedController.sayHello());
	}

}
