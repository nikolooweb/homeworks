package io.codelex.oop.summary.generics;


import java.math.BigDecimal;

public class Combiner {
    public static <T, G> String combineTwoItems(T first, G second) {
        return "First item: " + first + "; Second item: " + second;
    }

}
