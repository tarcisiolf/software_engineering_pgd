package advanced_programming.src.collections1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal8 {
    public static void main(String[] args) {

        TreeSet<String> listaNome = new TreeSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Guilianna");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        Iterator<String> iterator = listaNome.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
