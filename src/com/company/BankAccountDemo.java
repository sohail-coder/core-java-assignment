package com.company;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount sonuAccount = new BankAccount("sonu",1000);
        BankAccount bobAccount = new BankAccount("Bob");

        System.out.println(sonuAccount.getBalance());
        sonuAccount.deposit(2000);
        System.out.println(sonuAccount.getOwner()+sonuAccount.getBalance());

        System.out.println(bobAccount.getBalance());
        bobAccount.deposit(500);
        System.out.println(bobAccount.getOwner()+bobAccount.getBalance());
        bobAccount.withdraw(2000);
        System.out.println(bobAccount.getOwner()+bobAccount.getBalance());
    }
}
