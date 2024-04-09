public class lista {
    public static void main(String[] args) {
        String produto = "Mouse Logitech G304";
        double preco = 100.00;
        double aumento = 0.1;
        double desconto = 0.35;
        double venda = preco * (1 + aumento);
        double vendaComDesconto = venda - (venda * desconto);

        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + preco);
        System.out.println("Aumento: " + aumento);
        System.out.println("Desconto: " + desconto);
        System.out.println("Venda: " + venda);
        System.out.println("Venda com desconto: " + vendaComDesconto);
    }
}
