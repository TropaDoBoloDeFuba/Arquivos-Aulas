import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/bancoadm";
            String user = "root";
            String password = ""; // Defina a senha do seu usuário 'root' aqui
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: " + erro.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        Connection conn = Conexao.getConnection();
        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha na conexão!");
        }
    }
}
