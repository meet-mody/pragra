import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char cont;

        do {
            CalculatorDemo calc = new CalculatorDemo();
            calc.Welcome();
            System.out.println("Select the option:");
            int userinput = input.nextInt();

            System.out.println("Enter the first number");
            double number1 = input.nextDouble();
            System.out.println("Enter the second number");
            double number2 = input.nextDouble();

            switch (userinput) {
                case 1:
                    System.out.println(calc.Sum(number1,number2));
                    break;
                case 2:
                    System.out.println(calc.Subtract(number1,number2));
                    break;
                case 3:
                    System.out.println(calc.Multiply(number1,number2));
                    break;
                case 4:
                    System.out.println(calc.Divide(number1,number2));;
                    break;
                case 5:
                    System.out.println(calc.Modulus(number1,number2));
                    break;
                default:
                    System.out.println("Invalid Option Selected");
            }

            System.out.println("Do you want to continue? (Y/N)");
            cont = input.next().charAt(0);

        } while (cont != 'N' && cont != 'n');
    }

    public void Welcome(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~Welcome to My Calculator~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Enter the numbers beside for the operations");
        System.out.println("1 For Addition");
        System.out.println("2 For Subtraction");
        System.out.println("3 For Multiplication");
        System.out.println("4 For Division");
        System.out.println("5 For Modulus");
    }

    public double Sum(double number1, double number2){
        return number1 + number2;
    }

    public double Subtract(double number1, double number2){
        return number1 - number2;
    }

    public double Multiply(double number1, double number2){
        return number1 * number2;
    }

    public double Divide(double number1, double number2){
        if (number2 != 0) {
            return number1 / number2;
        }
        else{
            System.out.println("Divide by zero is not possible");
            return Double.NaN;
        }
    }

    public double Modulus(double number1, double number2){
        if (number2 != 0) {
            return number1 % number2;
        }
        else {
            System.out.println("Modulus by zero is not possible");
            return Double.NaN;
        }
    }

}
