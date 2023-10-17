package fundamentals.OOP.Interfaces;

public class example {
    // interface => a template that can be applied to a class
    // similar to inheritance, but specific what a class must do.
    // classes can apply more than one interfaces, inheritance is limited to 1 super

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
