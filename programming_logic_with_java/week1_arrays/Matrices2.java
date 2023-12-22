package week1_arrays;

public class Matrices2 {
    public static void main(String[] args) {
        int[][] matriz = { { 9, 8, 7 }, { 5, 3, 2 }, { 6, 6, 7 } };

        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

        for (int i = 0; i < 3; i++) {
            maiorLinha[i] = 0;
            menorColuna[i] = 10;
        }

        // Maior elemento linha

        for (int i = 0; i < 3; i++) {
            if (matriz[0][i] > maiorLinha[0]) {
                maiorLinha[0] = matriz[0][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matriz[1][i] > maiorLinha[1]) {
                maiorLinha[1] = matriz[1][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matriz[2][i] > maiorLinha[2]) {
                maiorLinha[2] = matriz[2][i];
            }
        }

        // Menor elemento coluna

        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] < menorColuna[0]) {
                menorColuna[0] = matriz[i][0];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matriz[i][1] < menorColuna[1]) {
                menorColuna[1] = matriz[i][1];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matriz[i][2] < menorColuna[2]) {
                menorColuna[2] = matriz[i][2];
            }
        }

        // Resultado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (maiorLinha[i] == menorColuna[j]) {
                    System.out.println("Ponto de sela: " + maiorLinha[i]);
                }
            }
        }

    }
}
