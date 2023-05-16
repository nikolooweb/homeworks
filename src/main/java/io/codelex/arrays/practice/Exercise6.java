package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 100) + 1;
        }

        int[] array2 = array1.clone();

        array1[array1.length-1] = -7;

        System.out.print("Array 1: ");
        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");
        for (int j : array2) {
            System.out.print(j + " ");
        }

    }
}
