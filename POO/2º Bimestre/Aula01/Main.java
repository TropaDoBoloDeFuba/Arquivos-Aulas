public class Main {

    public static void main(String[] args) {
        // Funcionário 01
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Rodolfo";
        funcionario01.CPF = "543.324.198-56";
        funcionario01.RG = "56.530.145-7";
        funcionario01.idade = 17;
        funcionario01.altura = 1.74;
        funcionario01.cargo = "CEO && Engenheiro de Software Back-End Sênior";
        funcionario01.salario = 15980.00;
        funcionario01.empresa = "NanoTech's Corp";

        // Funcionário 02
        Funcionario funcionario02 = new Funcionario();

        funcionario02.nome = "Luiz Octávio";
        funcionario02.CPF = "783.454.128-89";
        funcionario02.RG = "78.569.345-0";
        funcionario02.idade = 07;
        funcionario02.altura = 0.80;
        funcionario02.cargo = "Consultor de Segurança em Altura";
        funcionario02.salario = 5600.50;
        funcionario02.empresa = "NanoTech's Corp";
        
        // Funcionário 03
        Funcionario funcionario03 = new Funcionario();

        funcionario03.nome = "Paulo Henrique";
        funcionario03.CPF = "693.469.169-69";
        funcionario03.RG = "79.569.369-9";
        funcionario03.idade = 45;
        funcionario03.altura = 1.70;
        funcionario03.cargo = "Técnico em Trabalhos Explosivos";
        funcionario03.salario = 7800.56;
        funcionario03.empresa = "NanoTech's Corp";
        funcionario03.turno = "Noturno";
        funcionario03.patente = "Pleno";
        funcionario03.periodo = "22:00 às 6:30";
        funcionario03.chefe = "Rodolfo Gama";
        funcionario03.ferias = "Null";

        // Funcionário 04
        funcionario funcionario04 = new funcionario(
            "Lívia Maria", "576.899.378-57", "89.598.233-5", 17, 1.69, "Médica Especialista em Java", 12677.90, "NanoTech's Corp"
        );

        // Imprimindo
        funcionario01.imprimirDados();
        funcionario02.imprimirDados();
        funcionario04.imprimirDados();
    }
}
