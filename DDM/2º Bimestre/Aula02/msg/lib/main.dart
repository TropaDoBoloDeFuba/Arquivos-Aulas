import 'package:flutter/material.dart';

void main() {
  runApp(MainApp());
}

class MainApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Exemplo de Caixa de Diálogo'),
        ),
        body: Center(
          child: ElevatedButton(
            onPressed: () {
              // Mostra a caixa de diálogo quando o botão é pressionado
              showDialog(
                context: context,
                builder: (context) {
                  return AlertDialog(
                    title: Text('Caixa de Diálogo'),
                    content: Text('Este é um exemplo de caixa de diálogo.'),
                    actions: [
                      TextButton(
                        onPressed: () {
                          // Fecha a caixa de diálogo
                          Navigator.of(context).pop();
                        },
                        child: Text('Fechar'),
                      ),
                    ],
                  );
                },
              );
            },
            child: Text('Mostrar Caixa de Diálogo'),
          ),
        ),
      ),
    );
  }
}
