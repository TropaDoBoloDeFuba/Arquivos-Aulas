import java.sql.*;

public class ClientesDAO {
    private Connection conexao;

    public ClientesDAO() {
        try {
            conexao = ConexaoMySQL.getConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrarCliente(String nome, String email, String telefone, double renda) {
        String sqlInsert = "INSERT INTO `clientes` (`id`, `nome`, `email`, `telefone`, `renda`) VALUES (NULL, ?, ?, ?, ?);";

        try {
            PreparedStatement parametros = conexao.prepareStatement(sqlInsert);
            parametros.setString(1, nome);
            parametros.setString(2, email);
            parametros.setString(3, telefone);
            parametros.setDouble(4, renda);
            parametros.executeUpdate();

            System.out.println("Cliente cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
