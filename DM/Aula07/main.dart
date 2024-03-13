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

  print("");

  double preco = 100000;
  double parcela = 12;
  double juros = 0.04;
  double valorTotal = 0;

  // Loops
  for (int i = 1; i <= parcela; i++) {
    double valorParcela = preco / i;
    double valorComJuros = (valorParcela * juros) + valorParcela;
    print("O valor da " +
        i.toString() +
        "ª parcela é: " +
        valorComJuros.toStringAsFixed(2));
    valorTotal += valorComJuros;
  }

  print("Valor total sem juros: " + preco.toString());
  print("Valor total com juros: " + (valorTotal).toStringAsFixed(2));

  print(" ");
  // Array
  List<int> lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];

  // Saída do array
  lista.forEach((numeros) => print(numeros));

  print(" ");
  // Adicionar no array
  lista.add(200);
  lista.forEach((numeros) => print(numeros));
}
