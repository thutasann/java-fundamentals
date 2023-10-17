package fundamentals.OOP.Inheritance;

public class example {
    // inheritance = the process where one class acquires the attributes and methods of another class.

    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        car.stop();

        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        System.out.println("Car wheel " + car.wheel);
        System.out.println("Bicycle wheel " + bicycle.wheel);
    }

}
