package week1_repetition_structures;

import java.util.Scanner;

public class DoWhileStructure {

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Digite um valor qualquer ou 99 para sair");

            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        } while (opcao != 99);

    }
}
