import 'dart:math';

void main(List<String> args) {
  var peso = 50;
  var altura = 1.70;
  var IMC = peso / (pow(altura, 2));

  if (IMC < 18.5) {
    print("Abaixo do peso!");
  } else if (IMC >= 18.5 && IMC <= 24.5) {
    print("Peso normal!");
  } else if (IMC > 24.5) {
    print("Acima do peso!");
  }
}
