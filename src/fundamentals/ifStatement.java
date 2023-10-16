package fundamentals;

public class ifStatement {
    public static void main(String[] args) {
        int age = 18;

        if(age >= 18){
            System.out.println("you are adult");
        }
        else if(age == 18 ){
            System.out.println("You are okay");
        }
        else if (age >= 75){
            System.out.println("OK boomer");
        }
        else {
            System.out.println("You are not adult");
        }
    }
}
