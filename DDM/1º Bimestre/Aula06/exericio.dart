import 'dart:io';

void main(List<String> args) {
  print("Qual a sua idade? ");

  String? input = stdin.readLineSync();

  if (input != null) {
    int idade = int.parse(input);
    print("Ano que vem sua idade será ${idade + 1} anos.");
  } else {
    print("Não foi possível \n calcular a idade do \n colega. O valor é nulo.");
  }
}
