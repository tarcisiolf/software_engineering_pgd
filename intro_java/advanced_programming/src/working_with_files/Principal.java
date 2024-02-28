package working_with_files;

import java.io.File;
import java.util.Scanner;

public class Principal {
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de um arquivo com o seu path:\n");
        String nome = teclado.next();

        File objFile = new File(nome);
        if (objFile.exists()) {
            if (objFile.isFile()) {
                System.out.println("Nome do arquivo: " + objFile.getName());
                System.out.println("Tamanho do arquivo: " + objFile.length());
            } 
        }
        else {
            System.out.println("Arquivo inexistente");
        }
    }
}
