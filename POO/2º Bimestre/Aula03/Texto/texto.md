# Programação orientada à objetos

Pensamos em orientação à objetos, quando saímos de uma sintaxe precedural para uma ligada à classes. <br>
Exemplo de uma linguagem procedural: 
``` dart
    var nome;
    var telefone;
    var cidade;

    nome = "Rodolfo";
    telefone = "(12)98872-4674";
    cidade = "São José dos Campos";

    if (nome == "..." || telefone == "..." || cidade == "...") {
        conexao.new(tabela().salvar);
    }

    showDialog("Fechar");
```

Exemplo de uma linguagem orientada à objetos:
```java
    class Cliente {
        // Variáveis
        String nome;
        int telefone;
        String cidade;

        // Métodos
        ...
    }

    Clientes.nome = "Rodolfo";
    Clientes.telefone = 12988785678;
    Clientes.cidade = "Jacareí";

    Clientes.salvar();
```

No primeiro exemplo toda a estrutura do programa está em uma única estrutura. Qualquer atualização que for realizada no primeiro programa deve parar todo o sistema. Já no segundo, vemos a programação em bloco onde cada parte fica em um arquivo separadamente.

![](Imagem\diferencaDosScripts.png)

Em notação de objeto conseguimos separar: Banco de Dados, Layout e regra de negócios.

![](Imagem\separacaoPOO.png)