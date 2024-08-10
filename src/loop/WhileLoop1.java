package loop;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to run the loop until: ");

        int n = input.nextInt();
        int x = 1;
        int sum = 0;

        while (x <= n){
            System.out.println(x);
            sum = sum + x;
            x++;
        }

        System.out.println("\nThe sum of all the numbers is: " + sum);
    }
}
