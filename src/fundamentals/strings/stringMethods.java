package fundamentals.strings;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Bob";

        int reuslt = name.length();
        System.out.println(reuslt);

        char charResult = name.charAt(0);
        System.out.println(charResult);

        String replacedResult = name.replace('o', 'a');
        System.out.println(replacedResult);
    }
}
