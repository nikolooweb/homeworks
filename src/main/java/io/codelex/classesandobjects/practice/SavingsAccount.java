package io.codelex.classesandobjects.practice;

public class SavingsAccount {
    private double balance;
    public SavingsAccount(double startingBalance) {
        balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawMoney(double moneyToWithdraw){
        balance -= moneyToWithdraw;
    }

    public void depositMoney(double moneyToDeposit){
        balance += moneyToDeposit;
    }

    public void addMonthlyInterest(double interestRate){
        balance += (interestRate/12)/100 * balance ;
    }


}
