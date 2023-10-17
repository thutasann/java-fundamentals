package fundamentals.OOP.Static;

public class staticExample {
    // static = modifier. A single copy of a variable/method that is created and shared.
    // The class "owns" the static member.
    public static void main(String[] args) {

        // friend1 and friend2 are sharing the same static variable `numOfFriends`
        Friend friend1 = new Friend("Thuta");
        Friend friend2 = new Friend("Hsu");
        Friend friend3 = new Friend("Pyae");

        System.out.println(Friend.numOfFriends);

        Friend.drive();
        Friend.displayFriends();
    }
}
