package io.codelex.oop.persons;

public class Customer extends Person{
    private String customerId;
    private int purchaseCount;
    public Customer(String id, String firstName, String lastName, int age, String customerId, int purchaseCount){
        super(id, firstName, lastName, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    String getInfo() {
        return getFirstName() +  " " + getLastName() + " id: " + customerId + " purchase count: " + getPurchaseCount();
    }
}
