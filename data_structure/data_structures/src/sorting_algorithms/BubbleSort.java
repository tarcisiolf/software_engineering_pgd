package sorting_algorithms;

public class BubbleSort {

    public static int[] Bubble(int numbers[]) {
        final int n = numbers.length;
        int aux;

        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }

            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        int i, vet[] = { 9, 5, 1, 3, 10, 8, 4, 6, 7, 2 };

        vet = Bubble(vet);
        for (i = 0; i < 10; i++) {
            System.out.println(vet[i] + " ");
        }
    }
}
