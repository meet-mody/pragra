package loop;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the multiplication table you want to display: ");
        int n = input.nextInt();
        int x = 1;

        while (x <= 10){
            int multiply = n * x;
            System.out.println(n + " * " + x + " = " + multiply);
            x++;
        }
    }
}
