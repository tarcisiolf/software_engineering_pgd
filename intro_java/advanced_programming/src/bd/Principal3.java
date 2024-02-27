package advanced_programming.src.bd;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal3 {
    public static void main(String[] args) {

        // Final -> Atributo constante que não pode ser modificado
        final String usuario = "postgres";
        final String senha = "aluno123";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String intrucaoInsert = "INSERT INTO PESSOAS(id, nome) VALUES(?, ?)";
        final String driverBanco = "org.postgresql.Driver";

        try {

            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso");

            PreparedStatement preparedStatement = conexao.prepareStatement(intrucaoInsert);
            preparedStatement.setInt(1, 7);
            preparedStatement.setString(2, "Oswaldo");
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
