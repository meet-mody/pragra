import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double number1 = input.nextDouble();
        System.out.println("Enter the second number:");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        double multiply = number1 * number2;
        double divide = number1/number2;

        System.out.println("Sum: " + sum);
        System.out.println("Multiple: " + multiply);
        System.out.println("Divide: " + divide);

        System.out.println("Enter your name:");
        String name = input.next();

        System.out.println("My name is " + name);


    }
}
