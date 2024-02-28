package working_with_files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Principal2 {
    
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileWriter arq = new FileWriter("C:\\Users\\tarcisio.ferreira\\Desktop\\software_engineering_pgd\\intro_java\\advanced_programming\\src\\working_with_files\\notas.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        System.out.println("Digite sua matricula: ");
        matricula = teclado.next();

        System.out.println("Digite seu nome: ");
        nome = teclado.next();

        System.out.println("Digite seu teste: ");
        teste = teclado.nextDouble();

        System.out.println("Digite sua prova: ");
        prova = teclado.nextDouble();
        
        System.out.println("Digite suas faltas: ");
        faltas = teclado.nextInt();

        gravarArq.println(matricula);
        gravarArq.println(nome);
        gravarArq.println(teste);
        gravarArq.println(prova);
        gravarArq.println(faltas);

        arq.close();

        System.out.println("Gravação efetuadas com sucesso");

    }
}
