package io.codelex.classesandobjects.practice.accountApp;

public class FirstAccount {
    public static void main(String[] args) {

        Account account1 = new Account("Mathew", 100);
        account1.deposit(20);
        System.out.println(account1);

    }
}
