import 'dart:ffi';
import 'dart:math';

void main(List<String> args) {
  print("<-- Uso de variáveis e operadores -->");

  // Variáveis
  var a = 10;
  var b = 20;
  var c = 30;

  // Somatória
  var resultadoSoma = a + b + c;

  // Subtração
  var resultadoSubtracao = a - b - c;

  // Multiplicação
  var resultadoMultiplicacao = a * b * c;

  // Divisão
  var resultadoDivisao = a / b / c;

  // Divisão ignorando números irracionais
  var resultadoDivisaoB = 10 ~/ 3;

  // Resto de uma divisão
  var resultadoResto = 11 % 2;

  // Impressão
  print(resultadoSoma);
  print(resultadoSubtracao);
  print(resultadoMultiplicacao);
  print(resultadoDivisao);
  print(resultadoDivisaoB);
  print(resultadoResto);
  print(" ");

  // Função
  print("<-- Uso de funções -->");
  int somar(int d, int e, int f) {
    var result = d + e + f;
    return result;
  }

  print(somar(87, 56, 34));

  double expressaoMath(var a, var b, var c) {
    var resultado = (a + b + c) / (2 + pow(b, 2));
    return resultado;
  }

  print(expressaoMath(a, b, c));

  print(" ");

  // Operadores relacionais
  print("<-- Uso de Operadores Relacionais -->");
  print(a == b); // Igualdade
  print(a != b); // Diferente
  print(a > b); // Maior
  print(a < b); // Menor
  print(a >= b); // Maior igual
  print(a <= b); // Menor igual
  print("");

  //  Operadores em cascata
  print("<-- Operadores em cascata -->");
  final frase = StringBuffer()
    ..write("Operações")
    ..write(" matemáticas")
    ..write(" com o 3º Ano!");
  print(frase);

  print(50.toRadixString(2).padLeft(8, '0'));

  // Exemplo de armazenamento de tabela
  final map = {
    "nome": 'Márcio, Rodolfo, Jubileu, Lívão, Luisa, Giulia',
    "saldo": 'R\$0.00, R\$17.00, R\$-2.00, R\$5.00, R\$8.00, R\$9.00'
  };
  print(map['nome']);
  print(map['saldo']);

  final nome = ['Márcio', 'Lívão'];
  print(nome[0]);
  print(nome[1]);

  // Unir Buffers
  final vogais = ['a', 'e', 'i', 'o', 'u'];
  final consoantes = ['b', 'c', 'd', 'f'];
  final unir = [...vogais, ...consoantes];
  print(unir);
  print("");

  // If reduzido
  print("<-- If reduzido -->");
  int num = 43;
  print(num % 2 == 0 ? 'Par' : "Ímpar");
  print(" ");

  // Conversão de Dados
  print("<-- Conversão de Dados -->");
  int num2 = 90;
  print("O valor do número é: " + num2.toString());

  int continentes = 4000;
  print(continentes.runtimeType); // O runtimeType só armazena o tamanho em
  // bytes de uma variável quando ela é chamada

  String pedro = "Pedro";
  print(pedro);
}
