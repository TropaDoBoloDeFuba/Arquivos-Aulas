void main(List<String> args) {
  // Variáveis
  int nota = 9;
  int faltas = 3;
  String status = "Aberto";
  double preco = 560.00;

  // If and Else
  if (nota >= 5 && faltas <= 3) {
    print("Aluno aprovado!");
  } else {
    print("Aluno reprovado!");
  }
  print(" ");

  // Switch
  switch (status) {
    case "Aberto":
      print("Pedido de certificado aberto!");
      break;
    case "Andamento":
      print("Certificado sendo confeccionado!");
      break;
    case "Pendente":
      print("Aguardando a liberação da direção!");
      break;
    case "Fechado":
      print("Certificado impresso!");
      break;
    default:
      print("Status não verificado. Aguarde...");
      break;
  }
  print(" ");

  // Define até que parcela irá ser calculado
  int escolhaParcela = 24;

  // Parcelamento do certificado
  for (int parcela = 1; parcela <= escolhaParcela; parcela++) {
    double precoParcelado = preco / parcela;
    if (parcela == 1) {
      print(parcela.toString() +
          " Parcela: " +
          precoParcelado.toStringAsFixed(2));
    } else {
      print(parcela.toString() +
          " Parcelas: " +
          precoParcelado.toStringAsFixed(2));
    }
  }
  print(" "); // Pula linha

  // Lista de cursos
  List cursos = ["Java", "Dart", "C++", "NodeJS", "Python"];

  for (var lista in cursos) {
    print(lista);
  }

  print(" "); // Pula linha

  // While loop
  // var horas = 12;
  Duration horas = new Duration();
  int tempo = horas.inHours;

  while (tempo <= 23) {
    print("Acesso liberado até as 23 horas agora são: " + tempo.toString());
    tempo++;
  }
  print(" ");
  

  // Função de média
  double calcMedia(var nota1, var nota2, var nota3, var nota4) {
    var calc = (nota1 + nota2 + nota3 + nota4) / 4;
    return calc;
  }

  var media = calcMedia(7, 8, 9, 10);
  print("A média de 7, 8, 9 e 10 é: " + media.toString());
}
