import java.util.*;

class Main{
    public static void main(String[] args) {
        class Funcionarios {
            public String nome;
            public Integer idade;
            public String cargo;
            public double salario;
            public String cidade;

            public Funcionarios(String nome, Integer idade, String cargo, double salario, String cidade) {
                this.nome = nome;
                this.idade = idade;
                this.cargo = cargo;
                this.salario = salario;
                this.cidade = cidade;
            } 

            // GET
            public String getNome() {
                return this.nome;
            }
            public Integer getIdade() {
                return this.idade;
            }
            public String getCargo() {
                return this.cargo;
            }
            public double getSalario() {
                return this.salario;
            }
            public String getCidade() {
                return this.cidade;
            }

            // SET
            public void setNome(String nome) {
                this.nome = nome;
            }
            public void setIdade(Integer idade) {
                this.idade = idade;
            }
            public void setCargo(String cargo) {
                this.cargo = cargo;
            }
            public void setSalario(double salario) {
                this.salario = salario;
            }
            public void setCidade(String cidade) {
                this.cidade = cidade;
            }
        }

        Funcionarios cadastroFuncionario01 = new Funcionarios("Rodolfo Gama", 17, "Programador Back-end", 14000.89, "Jacareí - SP");

        System.out.println("<-- Funcionário 01 -->");
        System.out.println("Nome: " + cadastroFuncionario01.getNome());
        System.out.println("Idade: " + cadastroFuncionario01.getIdade());
        System.out.println("Cargo: " + cadastroFuncionario01.getCargo());
        System.out.println("Salário: " + cadastroFuncionario01.getSalario());
        System.out.println("Cidade: " + cadastroFuncionario01.getCidade());
    }

    //
    public class matriz {
        protected String senha;

        public matriz() {
            this.senha = "1234";
        }
    }

    public class filial extends matriz {
        public filial() {
            System.out.println(senha);
        }
    }
}