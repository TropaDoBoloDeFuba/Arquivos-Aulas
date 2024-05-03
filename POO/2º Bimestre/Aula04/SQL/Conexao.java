import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Conexao {
    static final String localhost = "jdbc:mysql://localhost:3306/jangoboy";
    static final String user = "root";
    static final String password = "";

    public static void main(String[] args){
        try {
            Connection conexao = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(localhost, user, password);

            if (conexao != null) {
                System.out.println("Conexão ativada com sucesso!");
            } else {
                System.out.println("Erro ao conectar o banco de dados!");
            }
        } catch (ClassNotFoundException e){
            System.out.println("Erro: Classe do Driver não encontrada");
        } catch (SQLException e) {
            System.out.println("Erro: Falha na conexão com o banco de dados");
        }
        
    }

}