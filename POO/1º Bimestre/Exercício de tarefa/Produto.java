public class Produto {
    private String nome;
    private Double preco;
    private Double venda;

    public Double aumentarPreco(Double taxa) {
        Double calculo = preco + (preco * taxa);
        return calculo;
    }

    public Double precoVenda(double taxa) {
        Double aumento = preco * taxa;
        Double venda = preco + aumento;
        return venda;
    }

    public void listarProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Preço de venda: R$" + precoVenda(0.2));
    }

    public static void main(String[] args) {
        // Produto 01
        Produto produto01 = new Produto();
        produto01.nome = "Mouse Wireless Logitech G703";
        produto01.preco = 450.0;

        // Listando o produto 01
        produto01.listarProduto();
    }
}