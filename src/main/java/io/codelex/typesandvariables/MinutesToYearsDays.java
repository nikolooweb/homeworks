package io.codelex.typesandvariables;

public class MinutesToYearsDays {
    public static void main(String[] args){
        int minutes = 6900;
        double days = (double) minutes / 1440;
        double years = (double) minutes / 525600;
        System.out.printf("%d minutes are equal to %.3f days or %.3f years !!!", minutes, days, years);
    }
}
