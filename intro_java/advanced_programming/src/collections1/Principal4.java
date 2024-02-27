package advanced_programming.src.collections1;

import java.util.ArrayList;

public class Principal4 {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Guilianna");

        for (String nome : listaNome) {
            System.out.println(nome);
        }

        listaNome.set(1, "Jujuba");

        System.out.println();
        System.out.println();
        System.out.println("Depois");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
    }
}