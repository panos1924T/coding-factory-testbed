package gr.aueb.cf.cf9.fromclass;

import gr.aueb.cf.cf9.fromclass.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.fromclass.exceptions.NegativeAmountException;

public class Account {

    private String iban;
    private double balance;

    public Account(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) {
            throw new NegativeAmountException("You may not add a negative number or zero.");
        }

        this.balance += amount;

        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount > this.balance) {
            throw new InsufficientBalanceException("The amount is bigger than the balance. Withdraw failed!");
        }

        this.balance -= amount;

        System.out.println("Withdraw success.");
    }

        public double getAccountBalance() {
            return this.balance;
    }
}

