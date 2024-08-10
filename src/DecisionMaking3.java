public class DecisionMaking3 {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 0 && age < 16){
            System.out.println("Not Eligible to Drive");
        } else if (age >= 16 && age < 19) {
            System.out.println("You can have Learners license");
        } else {
            System.out.println("Eligible to drive with restrictions");
        }
    }
}
