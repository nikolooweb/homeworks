package numbersGame;

import java.util.Random;

public class HelperClass {
    public static String formatTriviaText(String text){
        return text.replaceAll("^\\s*\\d+\\s*is\\s*", "");
    }
    public static Integer randomNumber(Integer number){
        Random rand = new Random();
        return rand.nextInt(((int)(number*1.1 - number*0.9)) + 1) + (int)(number*0.9);
    }
}
