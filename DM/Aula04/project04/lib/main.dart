import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Scaffold(appBar: AppBar(
      backgroundColor: Colors.black,
      title: const Text("Apresentação", style: TextStyle(
        color: Colors.blue,
        fontSize: 34.0
      ),), 
    ),
    body: Text("Sistema de ganhos absolutos!"),
    ),
  )
  );
}

