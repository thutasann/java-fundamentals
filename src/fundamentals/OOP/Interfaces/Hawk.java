package fundamentals.OOP.Interfaces;

public class Hawk implements Predator{
    @Override
    public void hunt() {
        System.out.println("Hunting");
    }
}
