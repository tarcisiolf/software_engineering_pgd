package collections1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Guilianna");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
    }
}