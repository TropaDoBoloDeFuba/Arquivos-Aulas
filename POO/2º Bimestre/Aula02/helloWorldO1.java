import javax.swing.*;

public class helloWorldO1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Swing");
        final JLabel label = new JLabel("Hello World!");
        frame.getContentPane().add(label);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.pack();
        frame.setVisible(true);
    }
}