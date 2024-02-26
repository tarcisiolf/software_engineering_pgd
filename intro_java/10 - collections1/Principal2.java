package collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal2 {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Guilianna");

        Iterator<String> iterator = listaNome.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}