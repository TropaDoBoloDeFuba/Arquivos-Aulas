public class Seguranca extends Funcionario {
    String turno;
    String patente;
    String periodo;
    String chefe;
    String ferias;

    public void imprimirDadosSeguranca() {
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