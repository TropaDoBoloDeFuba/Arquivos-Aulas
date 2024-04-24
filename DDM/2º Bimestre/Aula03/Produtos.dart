class Produtos {
  // Variáveis
  String nomeProduto;
  double preco;
  String categoria;
  String pais;

  // Contrutor
  Produtos(this.nomeProduto, this.preco, this.categoria, this.pais);

  @override
  String toString() {
    return 'Produto: ${nomeProduto}, Preço: R\$${preco.toStringAsFixed(2)}, Pais: ${pais}, Categoria: ${categoria}';
  }
}

class AdicionarProdutos {
  // Atributo da classe
  List<Produtos> meusProdutos = [];

  // Método para adição de produtos
  void add(String nomeProduto, double preco, String categoria, String pais) {
    Produtos novo = Produtos(nomeProduto, preco, categoria, pais);
    meusProdutos.add(novo);
  }

  void listarProdutos() {
    for (var i = 0; i < meusProdutos.length; i++) {
      print(meusProdutos[i]);
    }
  }
}

void main(List<String> args) {
  AdicionarProdutos cadastroProdutos = AdicionarProdutos();

  cadastroProdutos.add("RTX 4060", 1780.90, "Placas de vídeo", "Brasil");
  cadastroProdutos.add("Ryzen 5 8600G", 1800.90, "Processadores", "Brasil");
  cadastroProdutos.add(
      "Memória RAM DDR5 5200Mhz 16Bb", 890.00, "Memórias RAM", "China");
  
  for (var element in cadastroProdutos.meusProdutos) {
    print(element);
  }

  print(" ");

  cadastroProdutos.listarProdutos();
}
