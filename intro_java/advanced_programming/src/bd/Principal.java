package advanced_programming.src.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Principal {
    public static void main(String[] args) {

        // Final -> Atributo constante que não pode ser modificado
        final String usuario = "postgres";
        final String senha = "aluno123";
        final String url = "jdbc:postgresql://host:5432/postgres";
        final String driverBanco = "org.postgresql.Driver";

        try {
            Class.forName(driverBanco);
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro na conexão com o Banco de Dados");
        }
    }
}