package io.codelex.oop.persons;

abstract class Person {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public Person(String id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    abstract String getInfo();
}
