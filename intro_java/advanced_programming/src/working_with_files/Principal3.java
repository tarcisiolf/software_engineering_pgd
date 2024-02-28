package working_with_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome = "C:\\Users\\tarcisio.ferreira\\Desktop\\software_engineering_pgd\\intro_java\\advanced_programming\\src\\working_with_files\\arquivo.txt";

        System.out.printf("\n Conteúdo do arquivo texto: \n");


        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // Lê a primeira linha
            while (linha != null) {
                System.out.println(linha);
                linha = lerArq.readLine(); // Lê a segunda linha até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        System.out.println();
    }
}
