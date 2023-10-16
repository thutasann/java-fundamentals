package fundamentals.arrays;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Thuta";
        cars[0][1] = "Zaw";
        cars[0][2] = "Kyaw";

        cars[1][0] = "Aung";
        cars[1][1] = "Myo";
        cars[1][2] = "Zay";

        cars[2][0] = "Austin";
        cars[2][1] = "Victor";
        cars[2][2] = "Emily";

        for (int i = 0; i < cars.length; i++){
            System.out.println();
            for (int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
