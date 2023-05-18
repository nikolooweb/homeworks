package io.codelex.classesandobjects.practice.accountApp;

public class MoneyTransfers {
    public static void main(String[] args) {

        Account accountA = new Account("A", 100);
        Account accountB = new Account("B", 0);
        Account accountC = new Account("C", 0);

        transfer(accountA, accountB, 50);
        transfer(accountB, accountC, 25);

        System.out.println(accountA + " | " + accountB + " | " + accountC);

    }
    public static void transfer(Account from, Account to, double howMach){
        if (howMach <= from.balance()){
            from.withdrawal(howMach);
            to.deposit(howMach);
        } else {
            System.out.println("insufficient funds");
        }
    }
}
