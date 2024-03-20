public class livro {
    // Atributos da classe
    String nome;
    String categoria;
    Double preco;
    String pais;
    int quantidade;

    void listarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Categorsia: " + categoria);
        System.out.println("Preço: R$ " + preco);
        System.out.println("País: " + pais);
        System.out.println("Quantidade: " + Integer.toString(quantidade));
    }
    
    // Método de entrada de itens
    public int entradaEstoque(int quantidade) {
        int entrada = this.quantidade + quantidade;
        return entrada;
    }

    // Método de saída de itens
    public int saidaEstoque(int quantidade) {
        int saida = this.quantidade - quantidade;
        return saida;
    }

    // Método para aumento de preço
    public double aumentoPreco(double preco) {
        double calc = this.preco * 1.1; // + 10%
        return calc;
    }

    public static void main(String[] args) {
        livro livro01 = new livro();
        livro01.nome = "Aprenda Java como uma sênior!";
        livro01.preco = 70.00;
        livro01.categoria = "Programação";
        livro01.pais = "Brasil";
        livro01.quantidade = 10;

        livro01.listarDados();

        System.out.println("Quantidade anterior: " + Integer.toString(livro01.quantidade) + ", quantidade atual: " + livro01.entradaEstoque(10));

        livro livro02 = new livro();
        livro02.nome = "Cozinhe como um Masterchef!";
        livro02.preco = 40.00;
        livro02.categoria = "Alimentação";
        livro02.pais = "Portugal";
        livro02.quantidade = 7;

        livro02.listarDados();

        System.out.println(" ");;

        

    }
}

