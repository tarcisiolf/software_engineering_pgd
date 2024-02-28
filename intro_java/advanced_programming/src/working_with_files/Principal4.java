package working_with_files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova, media;
        int faltas;

        FileInputStream arq = new FileInputStream("C:\\Users\\tarcisio.ferreira\\Desktop\\software_engineering_pgd\\intro_java\\advanced_programming\\src\\working_with_files\\notas.txt");
        DataInputStream lerArq = new DataInputStream(arq);

        matricula = lerArq.readUTF();
        nome = lerArq.readUTF();
        teste = lerArq.readDouble();
        prova = lerArq.readDouble();
        faltas = lerArq.readInt();

        media = (teste + prova)/2;

        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Teste: " + teste);
        System.out.println("Prova: " + prova);
        System.out.println("Faltas: " + faltas);
        System.out.println("Media: " + media);

        arq.close();
    }
}
