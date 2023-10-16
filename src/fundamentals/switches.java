package fundamentals;

public class switches {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day){
            case "Sunday":
                System.out.println("This is Sunday");
                break;

            case "Wednesday":
                System.out.println("This is wednesday");
                break;
            default:
                System.out.println("This is none of these");
        }
    }
}
