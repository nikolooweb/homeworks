package io.codelex.collections.practice;


import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> carBrandsList = Arrays.asList(array);
        System.out.println(carBrandsList);

        //todo - replace array with a HashSet and print out the results
        Set<String> carBrandsSet = new HashSet<>();
        Collections.addAll(carBrandsSet, array);
        System.out.println(carBrandsSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> carBrandsMap = new HashMap<>();
        carBrandsMap.put(array[0], "Germany");
        carBrandsMap.put(array[1], "Germany");
        carBrandsMap.put(array[2], "Japan");
        carBrandsMap.put(array[3], "Germany");
        carBrandsMap.put(array[4], "Germany");
        carBrandsMap.put(array[5], "Germany");
        carBrandsMap.put(array[6], "USA");
        System.out.println(carBrandsMap);
    }
}
