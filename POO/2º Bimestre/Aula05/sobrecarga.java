public class sobrecarga {
    public int calcular(int a, int b) {
        return a + b;
    }

    public double calcular(double a, double b) {
        return a + b;
    }

    public String calcular(String a, String b) {
        return a + b;
    }
    public static void main(String[] args) {
        sobrecarga calcFerdinando = new sobrecarga();
        System.out.println(calcFerdinando.calcular(1,1));
        System.out.println(calcFerdinando.calcular(1.3,1.4));
        System.out.println(calcFerdinando.calcular("Rodolfo ", "Silva"));

    }
}
