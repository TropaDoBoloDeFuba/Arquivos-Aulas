class Usuario {
  String nome;
  int idade;

  Usuario(this.nome, this.idade);
}

void main(List<String> args) {
  List<Usuario> users = [];
  users.add(Usuario("Rodolfo", 17));
  users.add(Usuario("Luiz Octávio", 12));
  users.add(Usuario("Paulo Cucabeludo", 78));

  for (var user in users) {
    print("Nome: " + user.nome);
    print("Idade: " + (user.idade).toString());
  }
}
