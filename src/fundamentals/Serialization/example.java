package fundamentals.Serialization;
import java.io.FileOutputStream;
import java.io.*;


// Serialization => process of converting an object into a byte stream.
// Persist (save the state) the object after program exists
// This byte stream can be saved as a file or sent over a network
// Can be sent to a different machine
// Byte stream can be saved as a file (.ser) which is platform independent
// (Think oa this as if you are saving a file with the object's information)

// Deserialization => Reverse process of converting a byte stream into an object.
// This of this as if you're loading a saved file.

public class example {

    // STEPS TO SERIALIZE
    // 1: Your object class should implement `Serializable` interface
    // 2: add import java.io.Serializable
    // 3: FileOutputStream fileOut = new FileOutputStream(file path)
    // 4: ObjectOutputStream out = new ObjectOutputStream(fileOut)
    // 5: out.writeObject(objectName)
    // 6: out.close(); fileOut.close();

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.name = "Thuta sann";
        user.password = "123123";
        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved!!!!");
    }
}
