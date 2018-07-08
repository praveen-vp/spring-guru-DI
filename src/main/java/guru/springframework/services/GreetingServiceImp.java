/**
 * 07-Jul-2018
 * praveen-vp
 * GreetingServiceImp.java		
 */
package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author praveen-vp
 * 07-Jul-2018
 *
 */
@Service
public class GreetingServiceImp implements GreetingService {

	public static final String HELLO_GURU = "Hello Gurus --- Original Greting Service Imp";
	
	@Override
	public String sayGreeting() {
		return HELLO_GURU;
	}

}
