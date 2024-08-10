package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempts = 0;

        for (int x = 1; x <= 100; x++) {
            System.out.println("Enter your lucky number: ");
            int luckyNumber = input.nextInt();
            attempts++;

            if (luckyNumber == 55) {
                System.out.println("Congratulations! You are a winner!");
                break;
            } else {
                if (attempts >= 3) {
                    break;
                }
                System.out.println("Try again " + (attempts + 1) + " out of 3");
                continue;
            }
        }
    }
}
