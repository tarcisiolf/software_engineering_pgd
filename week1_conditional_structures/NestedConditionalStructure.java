// Lec 10

package week1_conditional_structures;

public class NestedConditionalStructure {
    public static void main(String[] args) {
        int nota = 4;

        if (nota >= 5) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        else if (nota >= 3 && nota < 5) {
            System.out.println("Exame");
        }

        else {
            System.out.println("Reprovado");
        }
    }
}
