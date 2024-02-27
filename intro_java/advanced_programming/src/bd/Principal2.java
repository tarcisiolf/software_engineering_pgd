package advanced_programming.src.bd;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Principal2 {
    public static void main(String[] args) {

        // Final -> Atributo constante que não pode ser modificado
        final String usuario = "postgres";
        final String senha = "aluno123";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String intrucaoSelect = "SELECT * FROM pessoas";
        final String driverBanco = "org.postgresql.Driver";

        try {

            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso");

            Statement sentenca = conexao.createStatement(intrucaoSelect);

            ResultSet rs = sentenca.executeQuery(intrucaoSelect);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("iD: " + id + " - Nome: " + nome);
            }

            System.out.println("Consulta Realizada com sucesso");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro na conexão com o Banco de Dados");
        }
    }
}
