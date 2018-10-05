package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 
 * @author praveen-vp 08-Jul-2018
 * 
 *         Added default profile for the GreetingService. If no profiles are
 *         defined then the default profile will be taken, As there is no
 *         qualifier for the Mycontroller and there are multiple primary
 *         implementations, namely PrimaryGreetingService,
 *         PrimaryMalayalamGreetingService and PrimaryGermanGreetingService.
 * 
 *         All the three services have a profile assosiated with it. If no
 *         profile is specified in the application.properties then the 'default'
 *         profile will be taken and the PrimaryGreetingService will be
 *         implemented.
 * 
 */

public class PrimaryGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}

}
