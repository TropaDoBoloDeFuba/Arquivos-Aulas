void main(List<String> args) {
  // Criando um objeto de conta bancária
  ContaRodolfo contaRodolfo = ContaRodolfo("Rodolfo", 1000.00);
  print("Saldo: R\$" + contaRodolfo.getSaldo().toStringAsFixed(2));

  // Depositando
  contaRodolfo.depositar(500);

  // Sacando
  contaRodolfo.salcar(-7);
}

class ContaRodolfo {
  String nome;
  double saldo;

  ContaRodolfo(this.nome, this.saldo);

  // Métodos Getter
  String getNome() {
    return nome;
  }

  double getSaldo() {
    return saldo;
  }

  // Métodos Setter
  void setNome(String nome) {
    this.nome = nome;
  }

  void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      print("O valor do depósito é de: R\$${valor.toStringAsFixed(2)}");
      print("Saldo disponível: ${saldo.toStringAsFixed(2)}");
    } else {
      print("Valor de depósito insuficiente");
    }
  }

  salcar(double valorSaque) {
    if (valorSaque <= 0){
      print("Saque indisponível nesse valor");
    } else if (valorSaque < saldo) {
      saldo -= valorSaque;
      print("O valor do saque é de: R\$${valorSaque.toStringAsFixed(2)}");
      print("Saldo disponível: ${saldo.toStringAsFixed(2)}");
    } else if (valorSaque > saldo) {
      print("Saldo insuficiente para esse saque");
    } 
  }
}
