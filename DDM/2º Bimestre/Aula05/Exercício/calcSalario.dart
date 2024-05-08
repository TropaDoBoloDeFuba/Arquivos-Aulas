void calcSalario(String nome, double salario) {
  if (salario <= 0) {
    print("Salário incompatível!");
    print("");
  } else if (salario < 1300) {
    var salarioLiquido = (salario + salario) - (salario * 0.5);
    print("Colaborador: " + nome);
    print("Salário: " + salarioLiquido.toStringAsFixed(2));
    print("");
  } else if (salario >= 1300 && salario < 1800) {
    var salarioLiquido = (salario + 500) - (salario * 0.1);
    print("Colaborador: " + nome);
    print("Salário: " + salarioLiquido.toStringAsFixed(2));
    print("");
  } else if (salario >= 1800 && salario < 2500) {
    var salarioLiquido = (salario + 300) - (salario * 0.2);
    print("Colaborador: " + nome);
    print("Salário: " + salarioLiquido.toStringAsFixed(2));
    print("");
  } else if (salario >= 2500) {
    var salarioLiquido = (salario + 1000) - (salario * 0.17);
    print("Colaborador: " + nome);
    print("Salário: " + salarioLiquido.toStringAsFixed(2));
    print("");
  }
}

void main(List<String> args) {
  calcSalario("Rodolfo", 7000);
  calcSalario("Luiz", 1750);
}
