import 'dart:io';

void main() {
  // Hello World
  print("Hello world");

  // Variáveis
  var nome = "Rodolfo";
  var ano = 2006;
  var altura = 1.74;
  var cursos = ["JavaScript", "Python", "Java", "Dart", "PHP"];
  bool possuiAuto = true;

  // Constante
  const double pi = 3.1416;

  // Operações
  int saldo = 1000;
  int saldo2 = 2000;
  int saldoTotal = saldo + saldo2;
  int desconto = 150;
  int valorComDesconto = saldoTotal - desconto;
  double aumento = saldoTotal * 0.5;
  double totalParcelado = saldoTotal / 5;

  saldoTotal++;

  print("Saldo: " + saldo.toString());
  print("Saldo 2: " + saldo2.toString());
  print("Saldo total: $saldoTotal");
  print(" ");

  // Tomada de decisão
  if (ano < 2000) {
    print("$nome é veterano!");
  } else {
    print("$nome é iniciante!");
  }

  // Array
  print(cursos);

  var entrada = stdin.readLineSync();
  print(entrada);
}
