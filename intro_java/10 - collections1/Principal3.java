package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal3 {
    public static void main(String[] args) {

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Oswaldo");
        listaNomes.add("Gisele");
        listaNomes.add("Giovanna");
        listaNomes.add("Giuliana");
        listaNomes.add("Jujuba");

        System.out.println("Elementos antes da ordenação:");

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println(listaNomes.get(i));
        }

        Comparator<String> comparator = Collections.reverseOrder();
        Collections.sort(listaNomes, comparator);

        System.out.println("Elementos após a ordenação:");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }
}
