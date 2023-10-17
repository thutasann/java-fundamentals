package fundamentals.OOP.Constructor;

public class constructorTest {
    public static void main(String[] args) {
        // constructor - special method that is called when an object is instantiated (created)

        Human human = new Human("Thuta", 21, 80);
        Human human2 = new Human("Hsu", 23, 80);

        System.out.println(human.name);
        System.out.println(human2.name);

        human.eat();
        human2.drink();
    }
}
