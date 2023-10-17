package fundamentals.OOP.Encapsulation;

public class example {
    // Encapsulation => attributes of a class will be hidden or private,
    // can be accessed only through methods (getters & setters)
    // You should make attributes private if you don't have a reason to make them

    public static void main(String[] args) {
        EnCar enCar = new EnCar("Chevrolet", "camero", 2023);
        //EnCar enCar1 = new EnCar("Ford", "Mustang", 2022);
        EnCar enCar1 = new EnCar(enCar);

        enCar.setYear(2024);
        System.out.println(enCar);
        System.out.println(enCar1);
        System.out.println();

        System.out.println(enCar.getModel());
        System.out.println(enCar.getMake());
        System.out.println(enCar.getYear());
        System.out.println();

        System.out.println(enCar1.getModel());
        System.out.println(enCar1.getMake());
        System.out.println(enCar1.getYear());
        System.out.println();

    }
}
