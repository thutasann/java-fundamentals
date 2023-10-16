package fundamentals.methods;

public class Example1 {
    public static void main(String[] args) {
        String name = "Thuta";
        int x = 3;
        int y = 4;
        int result = add(x, y);
        System.out.println(result);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
