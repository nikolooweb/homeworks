package io.codelex.arithmetic;

public class ExerciseOne {

    public static boolean checkIntegers(int a, int b) {
        if ((a == 15 || b == 15) || (a + b == 15 || Math.abs(a - b) == 15)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkIntegers(15, 15));
        System.out.println(checkIntegers(6, 3));
        System.out.println(checkIntegers(7, 8));
        System.out.println(checkIntegers(8, 23));
    }
}
