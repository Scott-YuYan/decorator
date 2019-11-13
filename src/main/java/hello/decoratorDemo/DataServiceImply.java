package hello.decoratorDemo;

import java.util.UUID;

public class DataServiceImply implements DataService {

    @Override
    public String getRandomString() {
        return UUID.randomUUID().toString();
    }
}
