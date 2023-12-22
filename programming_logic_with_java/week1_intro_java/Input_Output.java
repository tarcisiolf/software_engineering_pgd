// Lec 4

import java.util.Scanner;

class Input_Output {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        System.out.print("Olá Mundo");
        System.out.printf("Olá Mundo");

        System.out.println("Informe seu nome");

        String palavra;
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();

        System.out.println("Palavra: " + palavra);

        entrada.close();
    }
}