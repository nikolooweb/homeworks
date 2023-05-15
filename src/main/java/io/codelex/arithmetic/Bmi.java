package io.codelex.arithmetic;

import javax.imageio.stream.FileImageInputStream;
import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("what is your weight in kg: ");
        double weight = in.nextDouble();

        System.out.println("what is your height in cm: ");
        double height = in.nextDouble();

        double bmi = weight * 2.205 * 703 / Math.pow(height/2.54, 2);

        if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else {
            System.out.println("Your bmi is in good range");
        }

    }

}
