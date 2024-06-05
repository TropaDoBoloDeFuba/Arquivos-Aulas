import "package:flutter/material.dart";
import 'package:flutter/cupertino.dart';

class CampoTexto extends StatefulWidget {
  const CampoTexto({super.key});

  @override
  State<CampoTexto> createState() => _CampoTextoState();
}

class _CampoTextoState extends State<CampoTexto> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Entrada de dados"),
      ),
      body: Column(children: const <Widget>[
        Padding(padding: EdgeInsets.all(32),
        child: TextField(
          keyboardType: TextInputType.text,
          decoration: InputDecoration(
            labelText: "Digite o nome"
          ),
          enabled: true,
          maxLength: 50,
          style: TextStyle(
            fontSize: 20,
            color: Colors.black26
          ),
          obscureText: true,
        ),)
      ]),
    );
  }
}