package fundamentals.OOP.Encapsulation;

public class example {
    // Encapsulation => attributes of a class will be hidden or private,
    // can be accessed only through methods (getters & setters)
    // You should make attributes private if you don't have a reason to make them

    public static void main(String[] args) {
        EnCar enCar = new EnCar("Chevrolet", "camero", 2023);

        enCar.setYear(2024);

        System.out.println(enCar.getModel());
        System.out.println(enCar.getMake());
        System.out.println(enCar.getYear());
    }
}
