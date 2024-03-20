void main(List<String> args) {
  boasVindas();
}

void boasVindas() {
  String nome = "Rodolfo";
  print("Seja bem vindo " + nome + " ao sistema!");

  Duration tempo = new Duration();

  final now = DateTime.now();
  var dia = now.day.toString() + "/" + now.month.toString() + "/" + now.year.toString();
  var hora = now.hour;
  var minuto = now.minute;
  var segundo = now.second;

  print("Hoje é dia: " + dia.toString());
  print("São: " + hora.toString() + ":" + minuto.toString());
}
