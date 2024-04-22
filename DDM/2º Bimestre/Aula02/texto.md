# Atividades com Dart

1. Criar um arquivo com o nome msg.dart

```dart
messagebox(String msg) {
    showDialog(
        context: context,
        builder: (context) {
            return AlertDialog(
                content: Text(msg),
            )
        };
    )
};
```

A atividade acima irá criar uma caixa de diálogo com a finalidade de informar o usuário;

2. A simplicidade da orientação orientada à objetos em Dart e Flutter será utilizada para registrar os dados no Banco de Dados.

```dart
class Clientes{
    String nome;
    String endereco;
}
```