package fundamentals.OOP;

public class Objects {
    public static void main(String[] args) {
        // object = an instance of a class that may contain
        // attributes (characteristics) and methods (example: phone, des, computer, coffee cup)
        Car myCar = new Car();
        System.out.println(myCar.model);
        System.out.println(myCar.make);
        myCar.drive();
        myCar.stepBreak();

        Car myCar2 = new Car();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
    }
}
