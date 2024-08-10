package loop;

import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        System.out.println("Enter your phone number");
        String phone = scanner.nextLine();
        Overloading overload = new Overloading();
        System.out.println(overload.info(name));
        System.out.println(overload.info(name, email));
        System.out.println(overload.info(name, email, phone));
    }

    public String info(String name){
        return ("Hello " + name );
    }

    public String info(String name, String email){
        return ("Hello " + name + ", your email is: " + email);
    }

    public String info(String name, String email, String phone){
        return ("Hello " + name + ", your email is: " + email + ", and phone number is: " + phone);
    }

}
