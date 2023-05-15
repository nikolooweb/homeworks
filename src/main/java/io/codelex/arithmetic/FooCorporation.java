package io.codelex.arithmetic;

public class FooCorporation {

    String workerName;
    double basePay;
    int hoursWorked;

    public FooCorporation(String name, double basePay, int hoursWorked) {
        this.workerName = name;
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public void totalPay() {
        if (basePay > 8.0 && hoursWorked < 60) {
            double regularPay = 0;
            double overtimePay = 0;
            if (hoursWorked > 40) {
                regularPay = 40 * basePay;
                overtimePay = (hoursWorked - 40) * (basePay * 1.5);
            } else {
                regularPay = hoursWorked * basePay;
            }
            System.out.println(regularPay + overtimePay);
        } else {
            System.out.println("Error! base pay is too low or working hours are exceeded");
        }
    }

    public static void main(String[] args) {
        FooCorporation worker1 = new FooCorporation("Bob", 7.5, 35);
        FooCorporation worker2 = new FooCorporation("John", 8.2, 47);
        FooCorporation worker3 = new FooCorporation("Patrick", 10, 73);
        worker1.totalPay();
        worker2.totalPay();
        worker3.totalPay();
    }
}
