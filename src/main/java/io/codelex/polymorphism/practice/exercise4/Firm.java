package io.codelex.polymorphism.practice.exercise4;

import java.util.Arrays;

public class Firm {
    //-----------------------------------------------------------------
    // Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        Staff personnel = new Staff();

        CommissionedEmployee commissionedEmployee1 = new CommissionedEmployee("Mike", "353 Stud Lugger", "488-4999", "455-22-8474", 6.25, 400, 20);
        commissionedEmployee1.addHours(35);
        commissionedEmployee1.pay();
        CommissionedEmployee commissionedEmployee2 = new CommissionedEmployee("Johny", "777 Smog Lane", "533-7586", "323-23-2324", 9.75, 950, 15);
        commissionedEmployee2.addHours(40);
        commissionedEmployee2.pay();

        personnel.staffList = Arrays.copyOf(personnel.staffList, personnel.staffList.length + 1);
        personnel.staffList[personnel.staffList.length-1] = commissionedEmployee1;

        personnel.staffList = Arrays.copyOf(personnel.staffList, personnel.staffList.length + 1);
        personnel.staffList[personnel.staffList.length-1] = commissionedEmployee2;

        personnel.payday();
    }
} 
