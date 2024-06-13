import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class CadastroAlunos {
    private Connection conexao;

    public CadastroAlunos() {
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola", "root", "");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAluno(String nome, String turma, String ano, Integer idade, String turno, String telefone) {
        try {
            String add = "INSERT INTO `alunos` (`id`, `nome`, `turma`, `ano`, `idade`, `turno`, `telefone`) VALUES (NULL, ?, ?, ?, ?, ?, ?);";
            PreparedStatement campoProtegido = conexao.prepareStatement(add);
            campoProtegido.setString(1, nome);
            campoProtegido.setString(2, turma);
            campoProtegido.setString(3, ano);
            campoProtegido.setInt(4, idade);
            campoProtegido.setString(5, turno);
            campoProtegido.setString(6, telefone);
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