void main(){
  // Declarar variável
  var nome = 'Rodolfo';
  var ano = 2007;
  var listaDeProdutos = ['Mouse', 'Teclado', 'Impressora'];

  var listaDeProdutos2 = {
    'Produto':  ["Mouse"],
    'Produto2': ["Teclado"]
  };

  var lista = ['Cristiano', 'Ronaldo', 'Neymar', 'Juninho da Bike', 'Paula Tejano'];
  print(lista);

  lista.add("Paula Traz");
  print(lista);

  //Tamanho da lista
  print('Total de clientes ${lista.length}');

  //Remover item
  lista.remove('Juninho da Bike');
  print(lista);

  lista.add("Jubileu Nemeu");
  lista.add("Juninho da Bike");
  print(lista);

  lista.sort();
  print(lista);
}