package com.lbg.unittesting;

public class Bank {

    private String firstname, lastname;

    private double balance;

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amountDeposited) {
        double currentBalance = this.getBalance();
        currentBalance += amountDeposited;
        this.setBalance(currentBalance);
    }

    public String withdraw(double amountWithdrawn) {

        double tempBalance = this.getBalance();
        tempBalance -= amountWithdrawn;
        if(tempBalance < 15) {
            return "Transaction is invalid";
        } else {
            this.setBalance(tempBalance);
            return "Success";
        }
    }

    public Bank(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.setBalance(15.0);
    }

    public String getAccountHolderName(){
        return firstname + " " + lastname;
    }
}
