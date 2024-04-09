import java.util.*;

class Main {
    public static void main(String[] args) {
        class Carro {
            public String modelo;
            public String cor;
            public Integer ano;

            public Carro(String modelo, String cor, Integer ano) {
                this.modelo = modelo;
                this.cor = cor;
                this.ano = ano;
            }

            public String getModelo() {
                return this.modelo;
            }

            public String getCor() {
                return this.cor;
            }

            public Integer getAno() {
                return this.ano;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            public void setCor(String cor) {
                this.cor = cor;
            }

            public void setAno(Integer ano) {
                this.ano = ano;
            }
        }

        Carro cadastroDeCarro01 = new Carro(
            "Nissan Versa", "Branco", 2022    
        );

        System.out.println("Modelo: " + cadastroDeCarro01.getModelo());
        System.out.println("Cor: " + cadastroDeCarro01.getCor());
        System.out.println("Ano: " + cadastroDeCarro01.getAno());

        for (int i = 0; i <= 10000; i++) {
            System.out.print(i + " ");
        }
        
    }

}


