package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person{

    private double gpa;
    Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    void display() {
        System.out.println("Gpa: " + gpa + " | " + firstName + " " + lastName + " " + id);
    }
}
