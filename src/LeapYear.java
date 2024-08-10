public class LeapYear {

    public static void main(String[] args) {

        int year = 2023;

        if (year % 4 == 0) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
    }
}
