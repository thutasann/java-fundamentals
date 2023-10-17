package fundamentals.OOP.SuperKeyword;

public class example {
    // super keyword refers to the superClass (parent) of an object
    // very similar to the "this" keyword

    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 42, "rich");
        Hero hero2 = new Hero("Superman", 34, "fly");

        System.out.println(hero1.toString());

    }

}
