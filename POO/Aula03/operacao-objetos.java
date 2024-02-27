// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {

        // Ganhos
        int salario = 2000;
        int premio = 100;
        int alimentacao = 400;
        int creche = 500;
        int gasolina = 400;

        // Descontos
        int transporte = 200;
        int inss = 500;
        int estacionamento = 400;

        // Fórmulas
        int totalBruto = salario + premio + alimentacao + creche + gasolina;
        int totalDesc = transporte + inss + estacionamento;
        int totalLiquido = totalBruto - totalDesc;

        // Saída
        System.out.println("----- Salário -----");
        System.out.println("+ Salário: R$" + salario);
        System.out.println("+ Prêmio: R$" + premio);
        System.out.println("+ Alimentação: R$" + alimentacao);
        System.out.println("+ Creche: R$" + creche);
        System.out.println("+ Gasolina: R$" + gasolina);

        System.out.println("----- Descontos -----");
        System.out.println("- Transporte: R$" + transporte);
        System.out.println("- INSS: R$" + inss);
        System.out.println("- Estacionamento: R$" + estacionamento);

        System.out.println("----- Total -----");
        System.out.println("+ Total Bruto: R$" + totalBruto);
        System.out.println("+ Total de descontos: R$" + totalDesc);
        System.out.println("= Total líquido: R$" + totalLiquido);

        System.out.println(" ");

        class Funcionario {
            String nome = "";
            int salario = 0;
            int desconto = 0;
        }

        Funcionario cadastro = new Funcionario();
        cadastro.nome = "Rodolfo Figueiredo Gama";
        cadastro.salario = 4500;
        cadastro.desconto = 233;

        Funcionario cadastro02 = new Funcionario();
        cadastro02.nome = "Jubileu Nemeu";
        cadastro02.salario = 2800;
        cadastro02.desconto = 120;

        Funcionario cadastro03 = new Funcionario();
        cadastro03.nome = "Paula Tejano";
        cadastro03.salario = 4600;
        cadastro03.desconto = 310;

        System.out.println("Nome: " + cadastro.nome);
        System.out.println("Salário: " + cadastro.salario);
        System.out.println("Desconto: " + cadastro.desconto);
        System.out.println(" ");

        System.out.println("Nome: " + cadastro02.nome);
        System.out.println("Salário: " + cadastro02.salario);
        System.out.println("Desconto: " + cadastro02.desconto);
        System.out.println(" ");

        System.out.println("Nome: " + cadastro03.nome);
        System.out.println("Salário: " + cadastro03.salario);
        System.out.println("Desconto: " + cadastro03.desconto);
        System.out.println(" ");
    }
}
