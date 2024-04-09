public class Funcionario extends Pessoa {
    String cargo;
    String empresa;
    double salario;

    // Construtor de Funcionario
    public funcionario(
        String nome,
        String CPF,
        String RG,
        int idade,
        double altura,
        String cargo, 
        String empresa, 
        double salario
        ) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.RG = RG;
        this.idade = idade;
        this.altura = altura;
        this.cargo = cargo;
        this.empresa = empresa;
        this.salario = salario;
    }


    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("RG: " + RG);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Empresa: " + empresa);
        System.out.println("Turno: " + turno);
        System.out.println("Patente: " + patente);
        System.out.println("Período: " + periodo);
        System.out.println("Chefe: " + chefe);
        System.out.println("Férias: " + ferias);
        System.out.println();
    }
}