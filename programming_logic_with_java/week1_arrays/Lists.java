package week1_arrays;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> estados = new ArrayList<>();

        estados.add("Espírito Santo");
        estados.add("Cerará");
        estados.add("Rio de Janeiro");
        estados.add("Pernambuco");

        estados.remove("Ceará");

        estados.contains("Amazonas");
    }
}
