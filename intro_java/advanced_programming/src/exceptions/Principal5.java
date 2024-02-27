package advanced_programming.src.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal5 {
    public static void main(String[] args) {
        // Final -> Atributo constante que não pode ser modificado
        final String usuario = "postgres";
        final String senha = "aluno123";
        final String url = "jdbc:postgresql://host:5432/postgres";
        final String instrucaoSelect = "SELECT * FROM postgres";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoSelect);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                System.out.println("ID: " + id + " - Nome: " + nome);
            }

            System.out.println("Consulta realizada com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
