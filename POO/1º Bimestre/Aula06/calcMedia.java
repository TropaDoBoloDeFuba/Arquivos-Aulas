import java.util.Scanner;

public class calcMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantas notas você deseja calcular? ");
        Integer quantNotas = leitor.nextInt();

        Double somaNotas = 0.0;

        for (int i = 1; i <= quantNotas; i++) {
            System.out.println("Escreva a " + i + "ª nota: ");
            Double nota = leitor.nextDouble();
            somaNotas += nota;
        }

        Double media = somaNotas / quantNotas;

        System.out.println(media);
    }
}
