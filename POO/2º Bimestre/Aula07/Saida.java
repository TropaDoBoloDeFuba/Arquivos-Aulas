import java.util.ArrayList;
import java.util.List;

public class Saida {
    private int id;
    private int idFilme;
    private String data;
    private int quantidade;
    private double preco;
    
    // Lista estática para armazenar todas as instâncias de Saida
    private static List<Saida> saidas = new ArrayList<>();

    // Construtor padrão
    public Saida() {
    }

    // Construtor parametrizado
    public Saida(int id, int idFilme, String data, int quantidade, double preco) {
        this.id = id;
        this.idFilme = idFilme;
        this.data = data;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Filme
    public int getIdFilme() {
        return idFilme;
    }
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    // Data
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    // Quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Preco
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para adicionar um item à lista de saídas
    public static void adicionar(Saida saida) {
        saidas.add(saida);
    }

    // Método para obter todas as saídas
    public static List<Saida> getSaidas() {
        return saidas;
    }
}
