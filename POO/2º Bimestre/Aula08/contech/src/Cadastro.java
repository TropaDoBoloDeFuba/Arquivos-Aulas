import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Cadastro {
    private Connection conexao;

    public Cadastro() {
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/contech", "root", "");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void addUsuario(String nome, String senha) {
        try {
            String add = "INSERT INTO `usuario` (`id`, `nome`, `senha`) VALUES (NULL, ?, ?);";
            PreparedStatement campoProtegido = conexao.prepareStatement(add);
            campoProtegido.setString(1, nome);
            campoProtegido.setString(2, senha);
            campoProtegido.executeUpdate();
            System.out.println("Adicionado com sucesso!");
        } catch (Exception e) {
            if (e instanceof SQLDataException) {
                System.err.println("Data error occurred: " + e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}