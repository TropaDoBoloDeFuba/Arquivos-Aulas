void main(List<String> args) {
  var nome = "Rodolfo";
  var idade = 17;

  double porcentagem = 0.35;
  bool ativo = false;
  bool negativado = true;

  // Criando um objeto de conta bancária
  ContaBancaria contaRodolfo = ContaBancaria(1000.0);
  print("Saldo: R\$" + contaRodolfo.getSaldo().toStringAsFixed(2));

  // Depositando
  contaRodolfo.depositar(0);

  var bonus = 100;
  var resultado = calcularSalario(1000);
  var total = bonus + resultado;

  print("Salário + 25%: R\$${resultado}");
  print("Bônus: R\$${bonus}");
  print("Salário + Bônus: R\$${total}");
}

calcularSalario(double salario) {
  var total = salario * 1.25;
  return total;
}

class ContaBancaria {
  double saldo;

  ContaBancaria(this.saldo);

  double getSaldo() {
    return saldo;
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
}
