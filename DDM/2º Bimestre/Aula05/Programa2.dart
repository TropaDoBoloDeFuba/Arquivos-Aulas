class Usuario {
  String usuario;
  String senha;

  Usuario(this.usuario, this.senha) {
    this.usuario = usuario;
    this.senha = senha;
  }

  void autenticar() {
    var usuarioA = "Rodolfo Gama";
    var senhaA = "Nanotech";

    if (this.usuario == usuarioA && this.senha == senhaA) {
      print("Usuário autenticado!");
    } else {
      print("Usuário não autenticado!");
    }
  }
}

class Conta() {
  double saldo = 
}

void main(List<String> args) {
  Usuario novoUsuario = new Usuario("Rodolfo Gama", "Nanotech");
  novoUsuario.autenticar();
}
