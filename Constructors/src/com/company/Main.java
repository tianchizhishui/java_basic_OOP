package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount davidAccount = new BankAccount();
        davidAccount.setAccountNumber(11234565);
        davidAccount.addDeposit(2500);

        davidAccount.getWithdrawal(1500);

    }
}
