public class Funcoes {
    private String produto;
    private double preco;

    public Funcoes(String produto, double preco) {
        this.produto = produto;
        this.preco = preco;
    }

    // Métodos
    public void setProduto() {
        this.produto = produto;
    }

    public void setPreco() {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    // Funções
    public double calcularPrecoVenda(double descPorc) {
        double desconto = this.preco * (descPorc / 100);
        return this.preco - desconto;
    }

    public double calcularDesconto(double desconto) {
        return this.preco * (desconto / 100);
    }

    public static void main(String[] args) {
        Funcoes produto1 = new Funcoes("Carteira", 100.0);
        double descontoPorcentagem = 20;
        double precoVenda = produto1.calcularPrecoVenda(descontoPorcentagem);
        double desconto = produto1.calcularDesconto(descontoPorcentagem);

        System.out.println("Produto: " + produto1.getProduto());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Desconto: " + desconto);
        System.out.println("Venda: " + precoVenda);
    }
}