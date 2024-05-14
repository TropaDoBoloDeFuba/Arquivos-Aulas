public class Prova {
    public static void main(String[] args) {
        Pessoa pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Rodolfo Figueiredo Gama");
        ((PessoaFisica) pessoaFisica).setCPF(54332419763L);

        Pessoa pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("NanoTech");
        ((PessoaJuridica) pessoaJuridica).setCNPJ(32707230000181L);

        System.out.println("Saída Pessoa Física");
        System.out.println(pessoaFisica.getNome());
        System.out.println("Saída Pessoa Jurídica");
        System.out.println(pessoaJuridica.getNome());
    }
}

class Pessoa {
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class PessoaJuridica extends Pessoa {
    private Long CNPJ;

    public Long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return "Pessoa Jurídica: " + super.getNome() + "| CNPJ: " + getCNPJ();
    }
}

class PessoaFisica extends Pessoa {
    private Long CPF;

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return "Pessoa Física: " + super.getNome() + "| CPF: " + getCPF();
    }
}
