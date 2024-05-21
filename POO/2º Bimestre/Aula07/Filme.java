public class Filme {
    int idFilme;
    String filme; 
    String categoria; 
    double preco; 

    // Construtor
    public Filme(int idFilme, String filme, String categoria, double preco) {
        this.idFilme = idFilme;
        this.filme = filme;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Getter
    public int getIdFilme() {
        return idFilme;
    }
    public String getFilme() {
        return filme;
    }
    public String getCategoria() {
        return categoria;
    }
    public double getPreco() {
        return preco;
    }

    // Setter
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
