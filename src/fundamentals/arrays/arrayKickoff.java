package fundamentals.arrays;
import java.util.Arrays;

public class arrayKickoff {
    public static void main(String[] args) {
        String[] cars = {"Toyota", "Swift"};
        cars[0] = "Lamb";
        System.out.println(Arrays.toString(cars));

        String[] students = new String[3];
        students[0] = "Thuta";
        students[1] = "Kyaw";
        students[2] = "Zaw";

        for (String student : students) {
            System.out.println(student);
        }
    }
}
