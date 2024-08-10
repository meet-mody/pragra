package loop;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to run the loop until: ");

        int n = input.nextInt();
        int x = 1;
        int sum = 0;

        do {
            System.out.println(x);
            sum = sum + x;
            x++;
        } while (x<=n);

        System.out.println("The sum of all numbers is " + sum);
    }
}
