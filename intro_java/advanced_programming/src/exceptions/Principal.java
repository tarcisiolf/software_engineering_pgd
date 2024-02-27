package advanced_programming.src.exceptions;

public class Principal {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
