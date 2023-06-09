package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert{
    private int dimensionAreaM2;
    private int numberOfCopies;
    private int costPerM2;
    public Poster(int fee, int dimensionAreaM2, int numberOfCopies, int costPerM2) {
        super(fee);
        this.dimensionAreaM2 = dimensionAreaM2;
        this.numberOfCopies = numberOfCopies;
        this.costPerM2 = costPerM2;
    }

    public int cost() {
        return fee + numberOfCopies*(dimensionAreaM2*costPerM2);
    }

    @Override
    public String toString() {
        return "Poster{" +
                "dimensionAreaM2=" + dimensionAreaM2 +
                ", numberOfCopies=" + numberOfCopies +
                ", costPerM2=" + costPerM2 +
                '}';
    }
}
