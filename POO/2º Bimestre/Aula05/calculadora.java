public class calculadora {
private String modelo;
private String marca;
private String uso;
    

//criar a sobrecarga de construtor
public calculadora(){

}
public calculadora(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
}
public calculadora(String marca, String modelo, String uso){
    this.marca = marca;
    this.modelo = modelo;
    this.uso = uso;
}
public somar(int a, int b){
    return a+b;
}
public somar(double a, double b){
    return a+b;
}
public somar(String a, String b){
    return a+b;
}
public static void main(String[] args) {
    calculadora calcA = new calculadora("optex", "n10", "Empresarial");
    calculadora calcB = new calculadora("Zion", "NEO10");   
    System.out.println(calcA.somar(900,1000));
    System.out.println(calcA.somar(900.11,1000.00));
    System.out.println(calcA.somar("Sobrecarga de ","Construtores"));
    System.out.println("Calculadora A " + calcA.marca + " Modelo" + calcA.modelo + " Uso:" + calcA.uso);
    System.out.println("Calculadora B " + calcB.marca + " Modelo" + calcB.modelo + " Uso:" + calcB.uso);
}
}