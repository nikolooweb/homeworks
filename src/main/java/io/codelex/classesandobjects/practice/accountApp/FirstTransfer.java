package io.codelex.classesandobjects.practice.accountApp;

public class FirstTransfer {
    public static void main(String[] args) {

        Account mattsAccount = new Account("Matt", 1000);
        Account myAccount = new Account("Nikolajs", 0);

        mattsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}
