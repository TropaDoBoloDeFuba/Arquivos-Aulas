package Part01;
class Main {
    public static void main(String[] args) {
        class Pessoa{

            // Criar os campos ou atributos
            public String nome;
            public String telefone;
            public String endereco;

            // Método construtor, permitir os dados serem enviados e armazenados
            // possibilita get() -> buscar e set() -> armazenar

            public Pessoa(String nome, String telefone, String endereco) {
                // Coloca o nome do atributo com a palavra this,
                // eu estou apontando para um atributo dentro da classe

                this.nome = nome;
                this.telefone = telefone;
                this.endereco = endereco;
            }

            public String getNome() {
                return this.nome;
            }

            public String getTelefone() {
                return this.telefone;
            }

            public String getEndereco() {
                return this.endereco;
            }

            // Armazenar as informações 
            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setTelefone(String telefone) {
                this.telefone = telefone;
            }

            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }
        }

        // Criar um objeto chamado Cadastro de Funcionário
        Pessoa cadastroDeFuncionario01 = new Pessoa(
            "Rodolfo", "12988122768", "Rua Aloísio do Amaral, 578, Jacareí - MG"
        );

        System.out.println("Nome: " + cadastroDeFuncionario01.getNome());
        System.out.println("Telefone: " + cadastroDeFuncionario01.getTelefone());
        System.out.println("Endereço: " + cadastroDeFuncionario01.getEndereco());
    }
}