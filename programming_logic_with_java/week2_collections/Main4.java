package week2_collections;

import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<Integer>();

        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        System.out.println("TreeSet: " + numeros);

        boolean result = numeros.remove(6);
        System.out.println("Removeu???: " + result);
    }
}
