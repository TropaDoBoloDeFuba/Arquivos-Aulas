void main(List<String> args) {
  // Operadores lógicos
  // == Igual
  // != Diferente
  // > Maior
  // < Menor
  // >= Maior igual
  // <= Menor igual
  // && (and)
  // || (or)

  // Operações matemáticas
  var nome = "Rodolfo";
  int nota1 = 5;
  int nota2 = 6;
  int nota3 = 8;
  int nota4 = 5;
  int faltas = 7;
  int somaNotas = nota1 + nota2 + nota3 + nota4;
  double media = somaNotas / 4;

  // Constante
  double pi = 3.14;

  // Saída
  print("1º Nota: " + nota1.toString());
  print("2º Nota: " + nota2.toString());
  print("3º Nota: " + nota3.toString());
  print("4º Nota: " + nota4.toString());

  print("Média: " + media.toString());

  // Variável booleano
  bool status = false;

  // Uso dos operadores lógicos
  if (media > 6 && faltas < 5) {
    status = true;
    print("Status do aluno: " + status.toString());
    print("Aluno aprovado!");
  } else {
    status = false;
    print("Status do aluno: " + status.toString());
    print("Aluno reprovado!");
  }
}
