package io.codelex.exceptions.practice;

import java.util.Arrays;

public class Exercise2 {
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (Exception a){
            a.printStackTrace(System.out);
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (Exception b){
            b.printStackTrace(System.out);
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            int i = 7/0;
        } catch (Exception c){
            c.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
