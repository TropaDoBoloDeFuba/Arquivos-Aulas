class Aluno {
  String nome;
  String turma;

  Aluno(this.nome, this.turma);

  @override
  String toString() {
    return ("Nome: $nome - Turma: $turma");
  }
}

void main(List<String> args) {
  List<Aluno> aluno = [];

  aluno.add(Aluno("Rodolfo Figueiredo Gama", "3ºA - INFO"));
  aluno.add(Aluno("Kauã Leonardo Janucci", "2º A - INFO"));
  aluno.add(Aluno("Leonardo Amaro Ribeiro", "3ºB - MCT"));

  print("Lista de Alunos");
  for (var element in aluno) {
    print(element);
  }

  aluno[1].nome = "Max Verstappen";

  print(" ");
  print("Lista atualizada!");

  for (var element in aluno) {
    print(element);
  }

  aluno.removeAt(2);

  print(" ");
  print("Aluno 3 removido!");

  for (var element in aluno) {
    print(element);
  }
}
