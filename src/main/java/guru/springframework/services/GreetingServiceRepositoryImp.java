package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceRepositoryImp  implements  GreetingRepository {

    @Override
    public String getGermanGreeting() {
        return "Hello -- Primary German Greeting service";
    }

    @Override
    public String getEnglishGreeting() {
        return  "Hello -- Primary English Greeting service";
    }

    @Override
    public String getMalayalamGreeting() {
        return "Hello -- primary Malayalam Greeting Service";
    }
}
