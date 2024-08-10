package Array;

public class Swap {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println("\nBefore Swapping");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        // Swapping
        int z = x;
        x = y;
        y = z;

        System.out.println("\nAfter Swapping");
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

    }
}
