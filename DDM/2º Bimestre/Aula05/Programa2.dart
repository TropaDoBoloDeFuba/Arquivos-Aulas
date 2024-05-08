class Usuario {
  String usuario;
  String senha;

  Usuario(this.usuario, this.senha);

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

class Conta {
  double saldo = 1000;
  double _valorSaque = 0;

  double get saque {
    return this._valorSaque;
  }

  set saque(double saque) {
    if (saque > saldo) {
      print("Saldo não autorizado!");
    } else {
      saldo -= saque;
      this._valorSaque = saque;
      print("Saque autorizado!");
      print("Saldo disponível: $saldo");
    }
  }
}

void main(List<String> args) {
  Usuario novoUsuario = Usuario("Rodolfo Gama", "Nanotech");
  novoUsuario.autenticar();

  Conta minhaConta = Conta();
  minhaConta.saque = 456;

  print("Valor do saque: ${minhaConta.saque}");
}
