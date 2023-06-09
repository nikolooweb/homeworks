package io.codelex.polymorphism.practice.exercise4;

public class CommissionedEmployee extends Hourly {

    //private double hours;
    private double sales;
    private double commissionRate;
    public CommissionedEmployee(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double sales,double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double pay() {
        return hoursWorked*payRate + (sales * commissionRate/100);
    }
}
