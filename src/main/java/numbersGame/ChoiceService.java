package numbersGame;

import java.util.*;

public class ChoiceService {
    public Map<String, Integer> getChoices(Integer originalNumber) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", HelperClass.randomNumber(originalNumber));
        map.put("B", HelperClass.randomNumber(originalNumber));
        map.put("C", HelperClass.randomNumber(originalNumber));
        map.put("D", HelperClass.randomNumber(originalNumber));

        List<String> keys = new ArrayList<>(map.keySet());

        String randomKey = keys.get(new Random().nextInt(keys.size()));

        map.put(randomKey, originalNumber);

        return map;
    }
}
