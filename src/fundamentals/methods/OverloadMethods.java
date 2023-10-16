package fundamentals.methods;

public class OverloadMethods {

    // Overload methods are methods that shares the same name
    // but have different parameters
    // method name + method parameters ==> method singature

    public static void main(String[] args) {
        int x = add(1, 3);
        System.out.println("Result " + x);
    }

    static int add(int a, int b){
        System.out.println("Overload method #1");
        return a + b;
    }

    static int add(int a, int b, int c){
        System.out.println("Overload method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("Overload method #3");
        return a + b + c + d;
    }

}
