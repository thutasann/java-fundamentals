package fundamentals.GenericClasses;

import java.util.HashMap;

// Another Generic pattern
// bounded types => you can create the objects of a generic class
// to have data of specific derived types ex. Number

public class example {
    public static void main(String[] args) {
        MyGenericClass<Integer> myInt = new MyGenericClass<Integer>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<Double>(1.1);
        MyGenericClass<Character> myChar = new MyGenericClass<Character>('T');
        MyGenericClass<String> myString = new MyGenericClass<String>("Hsu");

        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
