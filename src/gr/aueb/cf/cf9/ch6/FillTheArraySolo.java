package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * In this program we try to fill an Array in main
 * using two methods. The first method uses for loop
 * for each block of the array and calls method
 * number 2 to ask the user for an input.
 * At the end of this program the array in main
 * should be filled.
 */
public class FillTheArraySolo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the length of the array: ");
        int num = input.nextInt();

        int [] arr = new int[num];

        giveNumArray(arr, num);

        for (int item : arr) System.out.println(item + "");
    }

    public static void giveNumArray(int[] arr, int num) {
        for (int i = 0; i <= num - 1; i++) {
            System.out.println("Please enter number " + i + " block of the array: ");
            arr[i] = getArrayBlock();
        }
    }

    public static int getArrayBlock() {
        return input.nextInt();
    }
}
