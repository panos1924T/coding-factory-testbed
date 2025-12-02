package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class CheckIfFirstNumber {

    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please give a number you want to check " +
                "if it is Prime or not.");
        num = input.nextInt();

        System.out.println("The number you chose is a Prime number: " + isPrime(num));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i+= 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
