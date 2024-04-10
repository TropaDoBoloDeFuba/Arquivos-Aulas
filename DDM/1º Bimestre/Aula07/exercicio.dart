void main(List<String> args) {
  double preco = 3500;
  double aumento = 0.45; // 45% de aumento
  double valorAumento = preco * aumento;
  double valorVenda = preco + valorAumento;
  double desconto = 0.15; // 15% de desconto
  double valorDesconto = valorVenda * desconto;
  double venda = valorVenda - valorDesconto;
  int parcelas = 3; // Número de parcelas
  double valorParcelas = venda / 3; 
  bool status = false;

  if (valorVenda > 7) {
    status = false;
    print("Permitir parcelamento");
  } else {
    print("Não permite parcela");
  }

  print("Preço: " + preco.toString());
  print("Aumento: " + aumento.toString());
  print("Valor do aumento: " + valorAumento.toString());
  print("Valor da venda: " + valorVenda.toString());
  print("Desconto: " + desconto.toString());
  print("Venda: " + venda.toString());
  print("Parcelas: " + parcelas.toString());
  print("Valor das parcelas: " + valorParcelas.toStringAsFixed(2));
}