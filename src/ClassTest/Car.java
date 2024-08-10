package ClassTest;

public class Car {

    public static void main(String[] args) {
        Car car0 = new Car();
        Car car2 = new Car("Mercedes");
        Car car3 = new Car("Audi", "Black");
        Car car4 = new Car("Kia", "White", 2018);
        Car car5 = new Car("Ford", "White", 2022, "Sedan");

        System.out.println(car2.model);
    }

    String model;
    String color;
    int year;
    String type;

    Car(){
        model = "BMW";
        color= "Black";
        year = 2022;
        type = "Sedan";
    }

    Car(String model){      
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    Car(String model, String color, int year, String type) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.type = type;
    }
}




