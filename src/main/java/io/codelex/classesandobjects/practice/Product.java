package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + " EUR, amount " + amountAtStart);
    }

    public void setPriceAtStart(double price) {
        priceAtStart = price;
    }

    public void setAmountAtStart(int quantity) {
        amountAtStart = quantity;
    }

}
