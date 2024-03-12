import java.util.*;

public class arrayStudy {
    public static void main(String[] args) {
        System.out.println("<---- Estudo sobre Arrays ---->");
        // Integer array
        int[] notas = {10, 6, 8, 3};

        // String array
        String[] materias = {"Português", "Matemática", "Física", "História"};

        // Print arrays
        // Notas
        System.out.println(notas[0]);
        System.out.println(notas[3]);
        System.out.println(" ");

        // Matérias
        System.out.println(materias[0]);
        System.out.println(materias[2]);
        System.out.println(" ");

        // Matéria + Notas
        System.out.println(materias[0] + " - nota: " + notas[0]);
        System.out.println(" ");

        // Função length
        int lengthArray = notas.length; // Tamanho de uma array
        System.out.println("O tamanho da array 'notas[]' é: " + lengthArray);

        // Array loop
        for (int i = 0; i < notas.length; i++) {
            System.out.println(materias[i] + " = nota: " + notas[i]);
        }
        System.out.println(" ");

        // Input
        Scanner leitor = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = leitor.nextLine();
        System.out.println("Olá " + userName);

        // Array multidimensional
        int[][] notasBimestre = {{2, 3}, {4, 6}, {8, 9}, {7, 2}};
        System.out.println(Arrays.deepToString(notasBimestre));

        // Listagem rápida do array
        Integer[] newNotas = {2,6,8,3,9,0,2,5,6,2,3};
        Arrays.stream(newNotas).forEach(System.out::print);

    }
}