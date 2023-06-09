package io.codelex.polymorphism.practice.exercise3;

public class PersonApp {
    public static void main(String[] args) {
        Student student1 = new Student("Mark", "Wayne", "Oak street", 5999, 3.2);
        Employee employee1 = new Employee("Mike", "Wazovski", "GreenValley street", 3782, "Plumber");

        student1.display();
        employee1.display();
    }
}
