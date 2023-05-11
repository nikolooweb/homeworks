package io.codelex.loops;

public class NumberSquare {
    public static void main(String[] args) {
        int min = 1;
        int max = 5;

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j++) {

                System.out.print(j);

            }
            for (int j = 1; j <= i - 1; j++) {

                System.out.print(j);

            }
            System.out.println();
        }
    }
}
