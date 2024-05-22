void main(List<String> args) {
  var usuario = new Map();

  usuario["user"] = "admin";
  usuario["pass"] = '12345678';
  print(usuario["user"]);

  var novo = {"user": "NanoTech", "pass": "TechMaster"};
  usuario.addAll(novo);
  print(usuario);

  var novo2 = {"user": "Paulo", "pass": "69"};
  usuario.addAll(novo2);
  print(usuario);

  // Remover da lista
  usuario.remove(0);
  print(usuario);

  // Apagar o mapa inteiro
  usuario.clear();
}
