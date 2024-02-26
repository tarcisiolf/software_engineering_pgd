package collections1;

import java.util.HashSet;

public class Principal7 {
    public static void main(String[] args) {

        HashSet<String> listaNome = new HashSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Guilianna");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
    }
}
