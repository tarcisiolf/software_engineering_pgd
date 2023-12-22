package week2_collections;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Csharp");
        linguagens.add("Python");
        linguagens.add("JavaScript");

        System.out.println("ArrayList " + linguagens);

        /*
         * ArrayList -> Elementos em espaços distintos na memória
         * Vetor -> Elementos em espaços adjascentes da memória
         */

        String[] arr = new String[linguagens.size()];

        linguagens.toArray(arr);

        System.out.println("Array: " + arr);

        for (String item : arr) {
            System.out.println("Item: " + item);
        }
    }
}
