package fundamentals.OOP.Interfaces;

public class Fish implements  Prey, Predator{
    @Override
    public void hunt() {
        System.out.println("Fish hunting");
    }

    @Override
    public void flee() {
        System.out.println("Fish is Fleeing");
    }
}
