package io.codelex.arithmetic;

public class Product1ToN {

    public static int productOf(int start, int end) {
        int product = 1;
        for (int i = start; i <= end; i++) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(productOf(1, 10));
    }
}
