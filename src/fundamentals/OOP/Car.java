package fundamentals.OOP;

public class Car {
    String make = "Chevrolet";
    String model = "Coverette";
    int year = 2004;
    String color = "blue";
    double price = 5000.00;

    public String toString(){
        return make + "\n"+model+"\n"+year+"\n"+color;
    }

    void drive(){
        System.out.println("You drive the car");
    }

    void stepBreak() {
        System.out.println("You step on the break");
    }
}
