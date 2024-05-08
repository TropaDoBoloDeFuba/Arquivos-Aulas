public class Soja{
    public double calcular(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public double calcular(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    public static void main(String[] args) {
        Soja calcSoja = new Soja();
        System.out.println(calcSoja.calcular(1,1,1,1));
        System.out.println(calcSoja.calcular(1.3,1.4,1.5,1.6));

    }
}