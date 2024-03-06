public class MergeSort {
    public static void ms(int[] a, int begin, int end) {
        if (begin == end) {
            return;
        }

        int middle = (begin + end) / 2;
        ms(a, begin, middle);
        ms(a, middle + 1, end);
        merge(a, begin, middle, end);
    }

    public static void merge(int[] a, int begin, int middle, int end) {
        int n = end - begin + 1;
        int[] b = new int[n];
        int i1 = begin;
        int i2 = middle + 1;
        int j = 0;

        while (i1 <= middle && i2 <= end) {
            if (a[i1] < a[i2]) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j = j + 1;
        }

        while (i1 <= middle) {
            b[j] = a[i1];
            i1 = i1 + 1;
            j = j + 1;
        }

        while (i2 <= end) {
            b[j] = a[i2];
            i2 = i2 + 1;
            j = j + 1;
        }

        for (j = 0; j < n; j++) {
            a[begin + j] = b[j];
        }
    }

    public static void main(String[] args) {
        int i, vet[] = { 0, 8, -4, 16, -12, 17, 13, -9, 2, 11 };
        ms(vet, 0, 9);

        for (i = 0; i < 10; i++) {
            System.out.println(vet[i] + " ");
        }
    }
}
