class Clientes {
  String nome;
  int idade;
  String email;
  double nota;
  static List<Clientes> listaClientes = [];

  // Construtor
  Clientes(this.nome, this.idade, this.email, this.nota);

  // Adicionar clientes
  static void addCliente(String nome, int idade, String email, double nota) {
    Clientes novoCliente = Clientes(nome, idade, email, nota);
    listaClientes.add(novoCliente);
  }

  // Listagem de clientes
  static void listarClientes() {
    print("Lista de clientes");
    for (var i = 0; i < listaClientes.length; i++) {
      var element = listaClientes[i];
      print(
          "${i + 1} - Nome: ${element.nome}, Idade: ${element.idade}, Email: ${element.email}, Nota: ${element.nota}");
    }
  }

  // Testar nota
  void testarNota() {
    if (nota >= 7) {
      print("Aluno aprovado!");
    } else {
      print("Aluno reprovado!");
    }
  }
}

void main() {
  Clientes.addCliente("Rodolfo", 17, "rodolfo.gama2006@gmail.com", 9.0);
  Clientes.addCliente("Maria", 19, "maria@example.com", 6);

  Clientes.listarClientes();

  // Testando notas dos alunos
  for (var cliente in Clientes.listaClientes) {
    cliente.testarNota();
  }
}
