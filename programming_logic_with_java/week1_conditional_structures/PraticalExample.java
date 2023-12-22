// Lec 12
package week1_conditional_structures;

import java.util.Scanner;
import java.util.Random;

public class PraticalExample {
    public static void main(String[] args) {
        Random gerador = new Random();
        int x = gerador.nextInt(100);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Advinhe o número que estou pensando ");

        int numero = entrada.nextInt();

        if (numero == x) {
            System.out.println("Parabéns, você acertou, eu pensei no: " + x);
        } else {
            System.out.println("Você errou, pensei no " + x);
        }

        entrada.close();
    }
}
