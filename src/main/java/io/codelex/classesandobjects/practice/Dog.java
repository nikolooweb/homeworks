package io.codelex.classesandobjects.practice;

import java.util.Objects;

public class Dog {

    private String name;
    private String sex;

    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public String fathersName() {

        if (this.father == null) {
            return "Unknown";
        }
        return this.father.name;
    }

    public boolean hasSameMotherAs(Dog dog) {
        return (this.mother).equals(dog.mother);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(sex, dog.sex) && Objects.equals(mother, dog.mother) && Objects.equals(father, dog.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, mother, father);
    }
}
