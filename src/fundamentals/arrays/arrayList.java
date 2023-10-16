package fundamentals.arrays;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Pizza");
        foods.add("burger");
        foods.add("Soup");

        foods.set(0, "Sushi");
        foods.remove(2);
        foods.clear();


        for (int i = 0; i < foods.size(); i++){
            System.out.println(foods.get(i));
        }
    }
}
