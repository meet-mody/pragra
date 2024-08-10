import java.util.Scanner;

public class IVRDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Language Selection
        System.out.println("Welcome to ABC Customer Service.");
        System.out.println("Veuillez choisir une langue:");
        System.out.println("1. English");
        System.out.println("2. Français");

        int languageChoice = scanner.nextInt();

        if (languageChoice == 1) {
            // English Service Options
            System.out.println("Please choose an option:");
            System.out.println("1. Check Account Balance");
            System.out.println("2. Make a Payment");
            System.out.println("3. Speak to a Customer Service Representative");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You chose to check your account balance.");
                // Code to check account balance
                System.out.println("Your account balance is $500.00");
            } else if (choice == 2) {
                System.out.println("You chose to make a payment.");
                // Code to make a payment
                System.out.println("Please enter the amount you want to pay:");
                double amount = scanner.nextDouble();
                System.out.println("You have successfully paid $" + amount);
            } else if (choice == 3) {
                System.out.println("You chose to speak to a Customer Service Representative.");
                // Code to connect to a representative
                System.out.println("Please wait while we connect you to a representative...");
            } else if (choice == 4) {
                System.out.println("You chose to exit. Thank you for calling ABC Customer Service. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } else if (languageChoice == 2) {
            // French Service Options
            System.out.println("Veuillez choisir une option:");
            System.out.println("1. Vérifier le solde du compte");
            System.out.println("2. Effectuer un paiement");
            System.out.println("3. Parler à un représentant du service clientèle");
            System.out.println("4. Quitter");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Vous avez choisi de vérifier le solde de votre compte.");
                // Code to check account balance
                System.out.println("Le solde de votre compte est de 500,00 $");
            } else if (choice == 2) {
                System.out.println("Vous avez choisi d'effectuer un paiement.");
                // Code to make a payment
                System.out.println("Veuillez entrer le montant que vous souhaitez payer:");
                double amount = scanner.nextDouble();
                System.out.println("Vous avez payé avec succès $" + amount);
            } else if (choice == 3) {
                System.out.println("Vous avez choisi de parler à un représentant du service clientèle.");
                // Code to connect to a representative
                System.out.println("Veuillez patienter pendant que nous vous mettons en relation avec un représentant...");
            } else if (choice == 4) {
                System.out.println("Vous avez choisi de quitter. Merci d'avoir appelé le service clientèle ABC. Au revoir !");
            } else {
                System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } else {
            System.out.println("Invalid language choice. Please try again.");
        }

        scanner.close();
    }
}