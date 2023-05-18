package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class TestSavingsAccount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("How much money is in the account?:  ");
        int startingBalance = in.nextInt();

        System.out.print("Enter the annual interest rate:  ");
        int annualInterestRate = in.nextInt();

        System.out.print("How long has the account been opened?:  ");
        int timeInMonths = in.nextInt();

        SavingsAccount account1 = new SavingsAccount(startingBalance);

        double totalWithdraw = 0;
        double totalDeposit = 0;
        double totalInterestEarned = 0;

        for (int i = 1; i <= timeInMonths; i++) {

            System.out.print("Enter amount deposited for month: " + i + ":  ");
            double depositAmount = in.nextDouble();
            account1.depositMoney(depositAmount);
            totalDeposit += depositAmount;

            System.out.print("Enter amount withdrawn for " + i + ":  ");
            double withdrawAmount = in.nextDouble();
            account1.withdrawMoney(withdrawAmount);
            totalWithdraw += withdrawAmount;

            double beforeBalance = account1.getBalance();
            account1.addMonthlyInterest(annualInterestRate);
            double afterBalance = account1.getBalance();
            totalInterestEarned += afterBalance - beforeBalance;


        }

        System.out.println("Total deposited: $" + totalDeposit);
        System.out.println("Total withdrawn: $" + totalWithdraw);
        System.out.println("Interest earned: " + totalInterestEarned);
        System.out.println("Ending Balance: " + account1.getBalance());

        in.close();
    }
}
