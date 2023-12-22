package week1_repetition_structures;

import java.util.Scanner;

public class WhileStructure {
    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 99) {
            System.out.println("Digite um valor qualquer ou 99 para sair");

            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();

        }

    }
}
