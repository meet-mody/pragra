package StaticDemo;

public class StaticDemo {

    String name;
    int age;
    static String school = "Pragra";

    public StaticDemo(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }


    public StaticDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StaticDemo(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Student school: " + school);
    }

    public static void main(String[] args) {
        StaticDemo s1 = new StaticDemo("Meet", 28);
        s1.display();
        StaticDemo s2 = new StaticDemo("Joe", 30, "NYIT");
        s2.display();
    }
}
