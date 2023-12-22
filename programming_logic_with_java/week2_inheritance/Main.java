package week2_inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Pessoa p = new Pessoa();
         * p.nome = "Yan";
         * 
         * Vendedor v = new Vendedor();
         * v.nome = "Laís";
         * v.comissao = 8.6;
         * 
         * Conta cp = new Poupanca();
         * cp.setSaldo(5000);
         * cp.imprimeExtrato();
         * 
         * Conta2 cp2 = new Poupanca2();
         * cp2.depositar(732);
         * cp2.sacar(8);
         * cp2.getSaldo();
         * 
         * Scanner s = new Scanner(System.in);
         * 
         * try {
         * System.out.println("Digite um valor");
         * int numero1 = s.nextInt();
         * System.out.println(numero1);
         * } catch (Exception e) {
         * System.out.println("O valor não é um número");
         * }
         */

        Cachorro c = new Cachorro();
        c.setNome("Bidu");

        Gato g = new Gato();
        g.setNome("Pandinha");

        c.mostrar();
        g.mostar();
    }
}
