package io.codelex.oop.parcels;

public class Test {
    public static void main(String[] args) {
        Parcel test1 = new Parcel(50, 100, 60, 10, true);
        boolean isValid = test1.validate();
        System.out.println(isValid);
    }
}
