class Produtos {
  // Variáveis
  String nomeDoProduto;
  String categoria;
  double preco;

  // Construtor
  Produtos(
    this.nomeDoProduto,
    this.categoria,
    this.preco
  );

  // Listagem dos dados
  void listaDados() {
    print("Nome do produto: " + nomeDoProduto);
    print("Categoria: " + categoria);
    print("Preço: R\$" + preco.toString());
  }

  // Adição de produtos
  static adicionarProduto(String nomeDoProduto, String categoria, double preco) {
    return Produtos(nomeDoProduto, categoria, preco);
  }

  // Listagem de todos os produtos
  static listarTodosOsProdutos(List<Produtos>produtos) {
    for (var produto in produtos) {
      produto.listaDados();
      print(" ");
    }
  }

  // Remoção de produto
  static void apagarDados(List<Produtos>produto, int index) {
    if (index > 0 && index <= produto.length) {
      produto.removeAt(index);
      print("Registro removido com sucesso!");
    } else {
      print("Registro não encontrado!");
    }
  }

  // Atualização de produto
  void atualizarProdutos(String nomeDoProdutoNovo, String categoriaNovo, double precoNovo) {
    print("Lista atualizada");
    nomeDoProduto = nomeDoProdutoNovo;
    categoria = categoriaNovo;
    preco = precoNovo;
  }
}

void main(List<String> args) {
  List<Produtos>meusProdutos = [];

  // Adicionando 
  meusProdutos.add(
    Produtos.adicionarProduto("Ryzen 7 8700G", "Processadores", 1899.99)
  );

  meusProdutos.add(
    Produtos.adicionarProduto("Radeon RX 6600 Eagle 8Gb Gigabyte", "Placas de vídeo", 1375.99)
  );

  meusProdutos.add(
    Produtos.adicionarProduto("Geforce RTX 4090 24Gb Asus TUF", "Placas de vídeo", 12899.99)
  );

  // Listando os produtos
  Produtos.listarTodosOsProdutos(meusProdutos);

  // Removendo o produto com index 1
  Produtos.apagarDados(meusProdutos, 1);
  print(" ");

  // Listando a nova lista de produtos
  Produtos.listarTodosOsProdutos(meusProdutos); 

  // Atualizando um produto
  meusProdutos[1].atualizarProdutos("Geforce RTX 4090 24Gb Asus TUF", "Placas de vídeo", 14899.90); // Mudança de preço

  // Listando a lista atualizada
  Produtos.listarTodosOsProdutos(meusProdutos);
}