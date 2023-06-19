package numbersGame;

import org.apache.commons.lang3.tuple.Pair;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class TriviaApp {
    public static void main(String[] args) throws IOException, InterruptedException {

        TriviaQuestionService triviaQuestionService = new TriviaQuestionService();
        ChoiceService choiceService = new ChoiceService();
        AskedTrivias askedTrivias = new AskedTrivias();
        String api = "http://numbersapi.com/random/year?json";

        int correctAnswerCounter = 0;

        Scanner in = new Scanner(System.in);
        String answer;

        while (true) {

            Pair<Integer, String> question = triviaQuestionService.getAnswerAndQuestion(api);
            if (askedTrivias.getQuestions().contains(question.getValue())) {
                continue;
            }
            askedTrivias.addQuestion(question.getValue());
            Map<String, Integer> choices = choiceService.getChoices(question.getKey());

            boolean firstLoop = true;
            if (correctAnswerCounter == 20) {
                System.out.println("You acquired maximum points 20/20");
                break;
            }
            System.out.println(question.getKey() + " -> " + question.getValue()); // answer + question
            System.out.println(question.getValue());
            for (Map.Entry<String, Integer> keyValuePair : choices.entrySet()) {
                System.out.println(keyValuePair.getKey() + " -> " + keyValuePair.getValue());
            }

            do {
                if (!firstLoop) {
                    System.out.println("invalid input");
                }
                if (firstLoop) {
                    System.out.print("Choose A,B,C OR D: ");
                    firstLoop = false;
                }
                answer = in.nextLine();

            } while (answer.length() != 1 || answer.charAt(0) < 'A' || answer.charAt(0) > 'D');


            if (choices.get(answer).equals(question.getKey())) {
                System.out.println("correct!!! +1");
                correctAnswerCounter++;
            } else {
                System.out.println("=============================<CORRECT ANSWER>===================================");
                System.out.println(question.getKey() + " " + question.getValue());
                System.out.println("==============================================================================");
                System.out.printf("Correct answers %d/20", correctAnswerCounter);
                break;
            }
        }
    }
}
