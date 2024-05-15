class Pessoa {
  String nome;
  int idade;
  String cidade;
  String profissao;

  Pessoa(this.nome, this.idade, this.cidade, this.profissao);

  void mostrarDados() {
    print("Nome: $nome");
    print("Idade: $idade");
    print("Cidade: $cidade");
    print("Profissão: $profissao");
  }
}

class Aluno extends Pessoa {
  String curso;

  Aluno(String nome, int idade, String cidade, String profissao, this.curso)
      : super(nome, idade, profissao, cidade);

  @override
  void mostrarDados() {
    super.mostrarDados();
    print(curso);
  }
}
