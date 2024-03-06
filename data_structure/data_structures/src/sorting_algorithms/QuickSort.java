package sorting_algorithms;

public class QuickSort {
    public static void qs(int p, int q, int vector[]) {
        int x;
        if (p < q) {
            x = partition(p, q, vector);
            qs(p, x - 1, vector);
            qs(x + 1, q, vector);
        }
    }

    public static int partition(int p, int q, int vector[]) {
        int j = p - 1;
        int temp, aux = vector[q];

        for (int i = p; i <= q; i++) {
            if (vector[i] <= aux) {
                j++;
                temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int i, vector[] = { 12, 5, -3, 4, 0, 21, 8, -7, 9, 6 };
        qs(0, 9, vector);

        for (i = 0; i < 10; i++) {
            System.out.println(vector[i] + " ");
        }
    }
}
