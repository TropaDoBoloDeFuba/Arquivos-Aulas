import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Produtos {
    String nome;
    double preco;
    int parcelas;

    public Produtos(String nome, double preco, int parcelas) {
        this.nome = nome;
        this.preco = preco;
        this.parcelas = parcelas;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getParcelas() {
        return parcelas;
    }

    public double calculoParcela() {
        double valorParcela = preco / parcelas;
        return valorParcela;
    }

    public String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculadora de parcelas!");

        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas:"));

        Produtos produto01 = new Produtos(nome, preco, parcelas);

        JOptionPane.showMessageDialog(null,
                "Produto: " + produto01.getNome() + "\n" +
                "Preço à vista: R$" + produto01.formatarValor(produto01.getPreco()) + "\n" +
                "Qtd de parcelas: " + produto01.getParcelas() + "\n" +
                "Valor por parcela: R$" + produto01.formatarValor(produto01.calculoParcela())
        );
    }
}
