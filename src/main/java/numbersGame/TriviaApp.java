package numbersGame;

import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;
import java.util.Map;

public class TriviaApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        TriviaQuestionService triviaQuestionService = new TriviaQuestionService();
        Pair<Integer, String> answer = triviaQuestionService.getAnswerAndQuestion("http://numbersapi.com/random/year?json");
        System.out.println(answer.getKey() + " -> " + answer.getValue());
        ChoiceService choiceService = new ChoiceService();
        Map<String, Integer> choices = choiceService.getChoices(answer.getKey());
        for(Map.Entry<String, Integer> keyValuePair: choices.entrySet()){
            System.out.println(keyValuePair.getKey() + " -> " + keyValuePair.getValue());
        }
        // vel nav pabeigts
    }
}
