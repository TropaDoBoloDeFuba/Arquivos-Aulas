import java.util.*;

public class Bhaskara {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        double delta;
        double x1;
        double x2;

        a = 1;
        b = -3;
        c = -54;

        delta = (b^2) + (-4 * a * c);
        
        System.out.println("Delta: " + delta);
        
        if (delta >= 0) {
            x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
            x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
    }
}
