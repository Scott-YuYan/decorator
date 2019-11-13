package hello.decoratorDemo;

import java.util.HashMap;
import java.util.Map;

public class Cache implements DataService {
    private Map<String, String> resultMap = new HashMap<>();

    private DataService dataService;

    public Cache(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String getRandomString() {
        String cacheValue = resultMap.get("getRandomString");
        if (cacheValue == null) {
            String realValue = dataService.getRandomString();
            resultMap.put("getRandomString", realValue);
            return realValue;
        } else {
            return cacheValue;
        }
    }
}
