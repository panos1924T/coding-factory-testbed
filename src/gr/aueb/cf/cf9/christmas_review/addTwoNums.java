package gr.aueb.cf.cf9.christmas_review;

import java.util.Scanner;

public class addTwoNums {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please give two numbers to add: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = sumApp(a, b);

        System.out.printf("The sum of %d + %d = %d", a, b, sum);
    }

    public static int sumApp(int a, int b) {
        return a + b;
    }
}
