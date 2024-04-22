import 'dart:core';

class Clientes {
  String nome;
  String CPF;
  String telefone;
  String pais;

  // Construtor
  Clientes(this.nome, this.CPF, this.telefone, this.pais);

  // Método de listagem de dados
  void listarDados() {
    print("Nome: " + nome);
    print("CPF: " + CPF);
    print("Telefone: " + telefone);
    print("País: " + pais);
  }

  // Método para listar TODOS os clientes
  static void listarTodosDados(List<Clientes> clientes) {
    for (var cliente in clientes) {
      cliente.listarDados();
      print(" ");
    }
  }

  // Método de adição de dados
  static addDados(String nome, String CPF, String telefone, String pais) {
    return Clientes(nome, CPF, telefone, pais);
  }

  // Método de atualização de clientes
  void atualizarClinte(
      String nome2, String CPF2, String telefone2, String pais2) {
    nome = nome2;
    CPF = CPF2;
    telefone = telefone2;
    pais = pais2;

    print("Dados atualizados com sucesso!");
  }

  // Método para apagar dados
  static void apagarDados(List<Clientes> cliente, int codigo) {
    if (codigo >= 0 && codigo <= cliente.length) {
      cliente.removeAt(codigo);
    } else {
      print("Registro não encontrado");
    }

    print("Registro removido com sucesso!");
  }
}

void main(List<String> args) {
  List<Clientes> clientes = [];

  clientes.add(Clientes.addDados(
      "Rodolfo", "789.678.456-67", "(12) 98867-6748", "Groelândia"));

  clientes.add(
      Clientes.addDados("Luiz", "759.898.456-90", "(14) 98757-6476", "Angola"));

  clientes.add(Clientes.addDados(
      "Paula Tejano", "256.759.409-90", "(78) 91678-6236", "EUA"));

  // clientes[0].listarDados();
  // clientes[1].listarDados();

  Clientes.listarTodosDados(clientes);

  clientes[1].atualizarClinte(
      "Paulo", "759.898.456-90", "(12) 98757-6476", "Alemanha");

  Clientes.listarTodosDados(clientes);

  Clientes.apagarDados(clientes, 1);

  Clientes.listarTodosDados(clientes);
}
