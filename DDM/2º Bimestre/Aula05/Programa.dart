void exibirMensagem() {
  print("Mensagem");
}

void calcSalario(String nome, double salario, double bonus) {
  var salarioLiquido = (salario - (salario * 0.1)) + bonus;
  print("Colaborador: $nome");
  print("Salário líquido: " + salarioLiquido.toStringAsFixed(2));
  print(" ");
}

void calcSalario2(double salario, [double? bonus = 0, String? nome = " "]) {
  print("Nome: $nome");
  print("Bônus: $bonus");
  print("Salário: $salario");
}

void main(List<String> args) {
  exibirMensagem();
  calcSalario("Luiz Octávio", 5600, 150);
  calcSalario("Rodolfo Figueiredo", 27000.98, 6700);

  calcSalario2(1000, 50, "Arthur");
  calcSalario2(1000);
}

/* Atividade 
Criar uma Função que possibilite o usuário informar o desconto ou não
informar o desconto, ele deve calcular o valor final para então mostrar
o resultado.
A função deverá ter o parâmetro valor e o parâmetro opcional desconto
Sugestão de nome de Função: calcularVenda
*/