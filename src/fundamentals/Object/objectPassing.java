package fundamentals.Object;

public class objectPassing {
    public static void main(String[] args) {
        Gerage gerage = new Gerage();
        Car car =  new Car("BMW");
        gerage.park(car);
    }
}
