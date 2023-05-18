package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {

        Dog referenceToMax = new Dog("Max", "male");
        Dog referenceToRocky = new Dog("Rocky", "male");
        Dog referenceToSparky = new Dog("Sparky", "male");
        Dog referenceToBuster = new Dog("Buster", "male");
        Dog referenceToSam = new Dog("Sam", "male");
        Dog referenceToLady = new Dog("Lady", "female");
        Dog referenceToMolly = new Dog("Molly", "female");
        Dog referenceToCoco = new Dog("Coco", "female");

        referenceToMax.setMother(referenceToLady);
        referenceToMax.setFather(referenceToRocky);

        referenceToCoco.setMother(referenceToMolly);
        referenceToCoco.setFather(referenceToBuster);

        referenceToRocky.setMother(referenceToMolly);
        referenceToRocky.setFather(referenceToSam);

        referenceToBuster.setMother(referenceToLady);
        referenceToBuster.setFather(referenceToSparky);

        System.out.println(referenceToCoco.fathersName());
        System.out.println(referenceToSparky.fathersName());

        System.out.println(referenceToCoco.hasSameMotherAs(referenceToRocky));

    }
}
