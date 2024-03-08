package vectors;

import javax.swing.JOptionPane;

public class Somar2 {
    public static void main(String[] args) {

        int matSoma[][], a, b, soma = 0;
        matSoma = new int[10][12];

        for (a = 0; a <= 9; a++) {
            for (b = 0; b <= 11; b++) {
                matSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                soma = soma + matSoma[a][b];
            }
        }

        System.out.println("A soma dos 120 valores digitados é: " + soma);
        System.exit(0);
    }
}
