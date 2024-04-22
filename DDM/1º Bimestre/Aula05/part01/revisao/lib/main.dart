import "package:flutter/material.dart";

void main() {
  runApp(const MaterialApp(
    title: "Sistema",
    home: homePage(),
  ));
}

class homePage extends StatelessWidget {
  const homePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Home"),
      ),
      body: Center(child: ElevatedButton(
        child: Text("Download"),
        onPressed: () {
          Navigator.push(context, MaterialPageRoute(builder: (context) => DownloadPage()));
        },
      ),
      ),
    );
  }
}

class DownloadPage extends StatelessWidget {
  const DownloadPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Página de Download"),
      ),
      body: Center(
        child: Column(children: [
          Text("Obrigado por fazer o download! Agora seus dados são meus!"),
          ElevatedButton(onPressed: () {
            Navigator.pop(context, MaterialPageRoute(builder: (context) => homePage()));
          }, child: const Text("Voltar")
          )
        ],)
      ),
    );
  }
}