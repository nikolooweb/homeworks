package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> names = new HashSet<>();
        String inputName = null;

        while (true) {
            System.out.print("Enter name: ");
            inputName = in.nextLine();
            if (inputName.isBlank()) {
                break;
            }
            names.add(inputName);
        }
        System.out.println("Unique name list contains: " + names);
    }
}
