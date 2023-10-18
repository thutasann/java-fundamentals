package fundamentals.OOP.DynamicPolymorphism;

import java.util.Scanner;

public class example {
    // polymorphism -> many shapes / forms
    // dynamic -> after compilation (duration runtime)
    // example: A corvette is a : corvette and a car, and a vehicle, and an object.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");

        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("the choice was invalid");
            animal.speak();
        }
    }
}
