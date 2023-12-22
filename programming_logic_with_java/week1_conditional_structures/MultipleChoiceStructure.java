// Lec 11
package week1_conditional_structures;

import java.util.Scanner;

public class MultipleChoiceStructure {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar aluno: ");
        System.out.println("2 - Cadastrar notas: ");
        System.out.println("3 - Listar alunos e notas: ");

        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Vamos cadastrar o aluno");
                break;
            case 2:
                System.out.println("Vamos cadastrar nota");
                break;
            case 3:
                System.out.println("Listar alunos");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        entrada.close();
    }
}
