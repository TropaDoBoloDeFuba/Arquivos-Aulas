import 'package:flutter/material.dart';

void main() {
  runApp(const home());
}

class home extends StatelessWidget {
  const home({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Floresta Amazônica"),
      ),
      body: Center(
        child: Column(children: [
          const Text("Sistema de onças!")
        ]),
      ),
    );
  }
}

