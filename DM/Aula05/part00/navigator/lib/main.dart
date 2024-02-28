import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Meu App',
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Sistema de jogo"),
      ),
      body: Center(
        child: ElevatedButton(
          child: const Text("Download"),
          onPressed: () {
            Navigator.push(
              context,
              MaterialPageRoute(builder: (context) => RegisterPage()),
            );
          },
        ),
      ),
    );
  }
}

class RegisterPage extends StatelessWidget {
  const RegisterPage({Key? key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Página de Cadastro"),
      ),
      body: Center(
        child: Column(
          children: [
            ElevatedButton(
              child: const Text("Voltar"),
              onPressed: () {
                Navigator.pop(context);
              },
            ),
          ],
        ),
      ),
    );
  }
}
