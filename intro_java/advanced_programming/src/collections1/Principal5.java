package advanced_programming.src.collections1;

import java.util.Vector;

public class Principal5 {
    public static void main(String[] args) {

        Vector<String> listaNome = new Vector<>();

        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Guilianna");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
    }
}
