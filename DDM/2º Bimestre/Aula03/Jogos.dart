class Jogos {
  String nome;
  String categoria;
  double preco;

  Jogos(this.nome, this.categoria, this.preco);

  // Método de adição
  static add(String nome, String categoria, double preco) {
    return Jogos(nome, categoria, preco);
  }

  // Método de listagem
  void listarJogo() {
    print("Nome: $nome");
    print("Categoria: $categoria");
    print("Preco: R\$" + preco.toString());
  }

  // Método de listagem de todos os jogos
  static void listarJogos(List<Jogos> jogos) {
    for (var jogo in jogos) {
      jogo.listarJogo();
      print(" ");
    }
  }

  void atualizar(String nome2, String categoria2, double preco2) {
    nome = nome2;
    categoria = categoria2;
    preco = preco2;

    print("Lista atualizada!");
  }

  static void apagarJogo(List<Jogos> jogos, int index) {
    if (index >= 0 && index <= jogos.length) {
      jogos.removeAt(index);
    } else {
      print("Registro não encontrado! Tente outro.");
    }

    print("Registro removido com sucesso!");
  }

  // static void listagemAlfabetica(List<Jogos> jogos) {
  //   jogos.sort((a, b) => ,);
  //   Jogos.listarJogos(jogos);
  // }
}

void main(List<String> args) {
  List<Jogos> jogos = [];

  jogos.add(Jogos("Forza Horizon 5", "Corrida", 299.90));
  jogos.add(Jogos("Minecraft", "Mundo aberto", 150.00));
  jogos.add(Jogos("Red Dead Redemption 2", "Faroeste", 120.00));
  jogos.add(Jogos("Elden Ring", "Souls Like", 200.00));

  Jogos.listarJogos(jogos);

  print("---- // -----");

  jogos[3].atualizar("GTA 6", "Mundo Aberto", 670.00);

  Jogos.listarJogos(jogos);

  print("---- // -----");

  Jogos.apagarJogo(jogos, 2);
  Jogos.listarJogos(jogos);

  print("---- // -----");

  // Jogos.listagemAlfabetica(jogos);
}
