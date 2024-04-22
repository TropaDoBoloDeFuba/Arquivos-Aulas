import javax.swing.*;

public class helloWorldO2 extends JFrame{
    public helloWorldO2() {
        super("Hello World Swing");
        final JLabel label = new JLabel("Hello World");
        getContentPane().add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        helloWorld frame = new helloWorldO2();
    }
}