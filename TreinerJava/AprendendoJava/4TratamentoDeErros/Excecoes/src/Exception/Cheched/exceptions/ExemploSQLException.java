package Exception.Cheched.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploSQLException {
    public static void main(String[] args) {
        Connection conexao = null;
        Statement stmt = null;
        try {
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meu_banco", "usuario", "senha");
            stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tabela");

            while (rs.next()) {
                System.out.println("Coluna 1: " + rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
//O código tenta estabelecer uma conexão com um banco de dados MySQL e executar uma consulta SQL.
//Se ocorrer um erro ao acessar o banco de dados (por exemplo, se as credenciais estiverem incorretas),
//a SQLException é capturada e uma mensagem de erro é exibida.
//O bloco finally garante que a conexão e o Statement sejam fechados, mesmo que uma exceção ocorra.
//Se houver um erro ao fechar, ele também é tratado.