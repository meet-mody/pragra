package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What size array you want to create?: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value for index " + i + ": ");
            array[i] = sc.nextInt();
        };
        System.out.println("\nThe output array is: ");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}
