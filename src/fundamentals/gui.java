package fundamentals;

import javax.swing.*;

public class gui {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is "+ age);
    }
}
