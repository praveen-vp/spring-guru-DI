package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.services.GreetingServiceImp;

public class ConstructorInjectedDITest {

	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public void setUp() {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImp());
	}
	
	@Test
	public void test() {
		assertEquals(GreetingServiceImp.HELLO_GURU, this.constructorInjectedController.sayHello());
	}

}
