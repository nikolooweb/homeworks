package io.codelex.typesandvariables;

import java.util.LinkedHashMap;
import java.util.Map;


public class tableOfClassesAndTeachers {
    public static void main(String[] args) {
        LinkedHashMap<String, String> classes = new LinkedHashMap<String, String>();

        classes.put("English III", "Ms. Lapan");
        classes.put("Precalculus", "Mrs. Gideon");
        classes.put("Music Theory", "Mr. Davis");
        classes.put("Biotechnology", "Ms. Palmer");
        classes.put("Principles of Technology I", "Ms. Garcia");
        classes.put("Latin II", "Mrs. Barnett");
        classes.put("AP US History", "Ms. Johannessen");
        classes.put("Business Computer Infomation Systems", "Mr. James");

        System.out.println(classes.entrySet());

        String rightAlignFormat = "| %d | %36s | %15s |%n";
        String minus = "-";
        System.out.format("+%s+%n", minus.repeat(60));
        int idCounter = 1;
        for (Map.Entry<String, String> set : classes.entrySet()) {
            System.out.format(rightAlignFormat, idCounter, set.getKey(), set.getValue());
            idCounter++;
        }
        System.out.format("+%s+%n", minus.repeat(60));
    }
}
