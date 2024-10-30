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

    public void credit(double amountCredited) {
        double currentBalance = this.getBalance();
        currentBalance += amountCredited;
        this.setBalance(currentBalance);
    }

    public void debit(double amountDebited) {

        double tempBalance = this.getBalance();
        tempBalance -= amountDebited;
        if(tempBalance < 15) {

            System.out.println("This transaction is invalid!");
        } else {
            this.setBalance(tempBalance);
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
