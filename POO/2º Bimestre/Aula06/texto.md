# POO - Polimorfismo
Em linguagens de programação, o recurso de polimorfismo é muito aplicado quando há a necessidade de implementar códigos que necessitam ter seus comportamentos alterados. Neste princípio teremos uma **Super Classe** e esta irá emprestar seus métodos a outras classes e estas irão consumir esses métodos alterando seus comportamentos. <br>
Em alguns casos podemos até mesmo alterar todos os recursos do método sem sobrecarregar a memória do usuário.

**Exemplo:**
~~~Java
    // Super Classe
    Class Pessoa {
        private String nome;

        public Pessoa(String nome) {}
        public String GetNome() {}
        public void SetNome() {}
    }

    // Sub-classe
    Class PessoaFisica extends Pessoa {
        private int CPF;

        public PessoaFisica(int CPF) {}
        public int getCPF() {}
        public void setCPF(int val) {}

        public String getNome();
        public void setNome(String val);
    }

    // Sub-classe
    Class PessoaJuridica extends Pessoa {
        private int CNPJ;

        public PessoaJuridica(int CNPJ) {}
        public int getCNPJ() {}
        public void setCNPJ(int CNPJ) {}

        public String getNome();
        public void setNome(String val);
    }
~~~

**Obs.:** Quando é feita alteração na Classe principal (Super Classe), todas as sub-classes que herdam são modificadas.