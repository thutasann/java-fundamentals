package fundamentals;

public class printF {
    public static void main(String[] args) {
        // printF() -> optional method to control, format and display text to the console window
        // two arguments -> format string + (object/variable/value)

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

    }
}
