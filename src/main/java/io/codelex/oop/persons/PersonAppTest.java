package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonAppTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("1", "Nikolajs", "Rubaniks", 19, "junior java dev", LocalDate.of(2020, 1, 5));
        System.out.println(employee1.getInfo());

        Customer customer1 = new Customer("1", "Aivar", "Tylo", 44, "4377", 2);
        customer1.setPurchaseCount(10);
        System.out.println(customer1.getInfo());
    }
}
