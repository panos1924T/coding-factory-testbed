package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    static double balance = 0.0;

    /**
     * This program uses two methods. One to Deposit money in the account
     * and one to withdraw. It throws exceptions if the transactions are
     * not possible.
     */
    public static void main(String[] args) {
        Scanner inputAmount = new Scanner(System.in);
        double amount = 0.0;

        try {
            System.out.println("Please enter the amount of money you want to deposit: ");
            amount = inputAmount.nextDouble();
            deposit(amount);
            System.out.println("The balance after the deposit is: " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number. ");
            inputAmount.next();
        } catch (Exception e) {
            System.out.println("Δεν μπορεί να γίνει κατάθεση αρνητικού αριθμού ή μηδέν! ");
        }

        try {
            System.out.println("Please enter the amount of money you want to withdraw: ");
            amount = inputAmount.nextDouble();
            withdraw(amount);
            System.out.println("The balance after the withdraw is: " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number. ");
            inputAmount.next();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        inputAmount.close();
    }

    /**
     * This method takes the amount as data and deposits it into the account
     * @param amount        the amount of money to deposit
     * @throws Exception    if amount is negative or zero
     */
    public static void deposit(double amount) throws Exception {
        try {
            if (amount <= 0) throw new Exception("Amount cannot be negative or zero!");

            balance += amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());
            throw e;
        }
    }

    /**
     * This method takes the amount as data and withdraw it from the account
     * @param amount        the amount of money to withdraw
     * @throws Exception    if the balance is not enough for the withdrawal (balance < amount to withdraw)
     */
    public static void withdraw(double amount) throws Exception {
        try {
            if (amount <= 0) throw new Exception("Amount must be positive!");
            if (balance - amount < 0) throw new Exception("You don't have enough money to withdraw!");
            balance -= amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + "\n" + e.getMessage());
            throw e;
        }
    }
}
