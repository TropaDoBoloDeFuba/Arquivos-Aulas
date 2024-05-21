import java.util.ArrayList;
import java.util.List;

public class Entrada {
    int id;
    int idFilme;
    String data;
    int quantidade;
    double preco;

    public Entrada(int id, int idFilme, String data, int quantidade, double preco) {
        this.id = id;
        this.idFilme = idFilme;
        this.data = data;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getter e Setter
    public int getId(){
        return id;
    }
    public int getIdfilme(){
        return idFilme;
    }
    public String getData(){
        return data;
    }
    public int getQuantidade(){
        return quantidade;
    }
     public double getPreco(){
        return preco;
    }

    public void setEntrada(int id, int idfilme, String data, int quantidade, double preco) {
        this.id = id;
        this.idFilme = idfilme;
        this.data = data;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    
    private List<Entrada> entradas = new ArrayList<>();

    // Adicionar entrada
    public void adicionarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }
}
