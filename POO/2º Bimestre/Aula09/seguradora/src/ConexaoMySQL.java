import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String host = "jdbc:mysql://localhost:3306/seguradora";
    private static final String user = "root";
    private static final String pass = "";

    public static Connection getConexao() throws SQLException{
        return DriverManager.getConnection(host, user, pass);
    }
}
