package io.codelex.flowcontrol;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter any letter from the english alphabet:  ");
        char letter = in.nextLine().toLowerCase().charAt(0);

        switch (letter) {
            case 'a', 'b', 'c' -> System.out.print(2);
            case 'd', 'e', 'f' -> System.out.print(3);
            case 'g', 'h', 'i' -> System.out.print(4);
            case 'j', 'k', 'l' -> System.out.print(5);
            case 'm', 'n', 'o' -> System.out.print(6);
            case 'p', 'q', 'r', 's' -> System.out.print(7);
            case 't', 'u', 'v' -> System.out.print(8);
            case 'w', 'x', 'y', 'z' -> System.out.print(9);
        }
    }
}
