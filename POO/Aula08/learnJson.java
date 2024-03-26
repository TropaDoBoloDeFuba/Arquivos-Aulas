package br.com;
import java.io.*; // FileWriter and IOExcetion
import org.json.simple.JSONObject;

// Criar uma classe para escrever a saída de dados do Java

public class learnJson {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Cria um objeto Json
        JSONObject jsonObject = new JSONObject();

        FileWriter writeFile = null;

        // Vamos armazenar o conteúdo em objeto Json
        jsonObject.put("nome", "Rodolfo");
        jsonObject.put("sobrenome", "Figueiredo Gama");
        jsonObject.put("idade", 18);
        jsonObject.put("cidade", "Jacareí");
        jsonObject.put("pais", "Brasil");

        try {
            writeFile = new FileWriter("saida.json");
            writeFile.write(jsonObject.toJSONString());
            writeFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(jsonObject);
    }
    
}