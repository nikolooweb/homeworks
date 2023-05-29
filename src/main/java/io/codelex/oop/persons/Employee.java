package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person{
    private String position;
    private LocalDate startedWorking;

    public Employee(String id, String firstName, String lastName, int age, String position, LocalDate startedWorking) {
        super(id, firstName, lastName, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience(){
        return Period.between(startedWorking, LocalDate.now()).getYears();
    }


    @Override
    String getInfo() {
        return getFirstName() + " " + getLastName() + " " + position + " (" + getWorkExperience() + " years)";
    }
}
