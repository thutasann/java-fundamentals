package fundamentals.arrays;

import fundamentals.OOP.Car;

public class arrayOfObject {
    public static void main(String[] args) {
        FoodTest food1 = new FoodTest("Pizza");
        FoodTest food2 = new FoodTest("Hamburger");
        FoodTest food3 = new FoodTest("Hotdog");

        FoodTest[] foods = {food1, food2, food3};

        System.out.println(foods[0].name);
    }
}
