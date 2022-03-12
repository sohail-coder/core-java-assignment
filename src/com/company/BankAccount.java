package com.company;

public class BankAccount {
    String owner;
    int balance;
    public BankAccount(String owner){
        this(owner,0);
    }
    BankAccount(String owner,int balance){
        this.owner=owner;
        this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    public void deposit(int amount){
        if(amount > 0){
            balance+=amount;
        }
        else{
            System.out.println("Deposit amount should be greater than 0");
        }
    }
    public void withdraw(int amount){
        if(amount > 0 && amount<balance){
            balance-=amount;
        }
        else if(balance<amount){
            System.out.println("Balance insufficient ");
        }
        else if(amount<0){
            System.out.println("Amount should be greater than 0");
        }
    }
}
