package io.codelex.enums.practice;

public class Exercise1 {
    public static void main(String[] args) {
        for (Directions value : Directions.values()) {
            System.out.println(value + ":" + value.directionSimplified + ":" + value.ordinal());
        }
    }
}
