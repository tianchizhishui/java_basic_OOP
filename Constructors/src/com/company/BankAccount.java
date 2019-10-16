package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public double addDeposit(double amountDeposit) {
        balance = balance + amountDeposit;
        System.out.println("The current balance is " + balance);
        return balance;
    }

    public double getWithdrawal(double amountWithdrawal) {
        if ((balance-amountWithdrawal) < 0) {
            System.out.println("Invalid withdrawal");
            return balance;
        }
        System.out.println("You have withdrawal " + amountWithdrawal + ". the remaining balance is " + (balance - amountWithdrawal) );
        return balance = balance - amountWithdrawal;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
