package week2_collections;

import java.util.HashSet;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(8);

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
