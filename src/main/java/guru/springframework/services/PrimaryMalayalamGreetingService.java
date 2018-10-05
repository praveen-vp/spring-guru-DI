package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryMalayalamGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;

	public PrimaryMalayalamGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getMalayalamGreeting();
	}

}
