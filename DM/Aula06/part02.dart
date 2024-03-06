import 'dart:io';

void main() {
  // int valor1 = 6;
  // int valor2 = 6;

  // if (valor1 > 5 && valor2 < 7) {
  //   print("Aprovado");
  // } else {
  //   print("Reprovado");
  // }

  // Desafio
  String nome = "Rodolfo";
  double nota = 0;

  if (nota <= 4) {
    print("Aluno reprovado!");
  } else if (nota > 4 && nota <= 5) {
    print("Aluno de recuperação!");
  } else if (nota > 5 && nota < 6) {
    print("Aluno passará pelo conselho");
  } else if (nota >= 6 && nota <= 10) {
    print("Aluno aprovado! Parabéns");
  } else {
    print("Nota inválida");
  }
}
