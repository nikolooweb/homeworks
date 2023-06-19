package numbersGame;

import java.util.ArrayList;
import java.util.List;

public class AskedTrivias {
    private List<String> questions;

    public AskedTrivias() {
        questions = new ArrayList<>();
    }

    public void addQuestion(String question) {
        questions.add(question);
    }

    public List<String> getQuestions() {
        return questions;
    }
}
