import 'dart:io';

void main(List<String> args) {
  List<String> lista = ["ADM", "LAB", "SEC", "POR"];
  print(lista);

  List<int> numeros = [1, 2, 3, 4, 5];
  print(numeros);

  // Add itens
  lista.add("EST");
  print(lista);

  numeros.add(56);
  print(numeros);

  // Índice da lista
  print(lista[2]);
  print(lista[4]);

  // Add por índice
  lista.insert(2, "DIR");
  print(lista);

  // Verificação de itens na lista
  print(lista.contains("DIR"));

  // Verificação de itens na lista com variáveis
  var entrada = "ESC";
  print(lista.contains(entrada));

  // Entrada de informações pelo terminal
  // print("Digite um item para verificar se está na lista:");
  // String? entradaT = stdin.readLineSync();
  // print(lista.contains(entradaT));

  // Tamanho de array
  print(lista.length);
}
