import 'dart:io';

void main() {
  print("Digite um valor inteiro: ");
  int numero = 34;

  int fatorial = calcfator(numero);
 
  print("O fatorial de $numero é: $fatorial");
}

int calcfator(int n) {
  if (n == 0) {
    return 1;
  } else {
    return n * calcfator(n - 1);
  }
}