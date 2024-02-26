package collections2;

import java.util.LinkedHashMap;

public class Principal2 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("vava", "Oswaldo");
        listaNomes.put("gisa", "Gisele");
        listaNomes.put("gigi", "Giovanna");
        listaNomes.put("giugiu", "Giulianna");

        System.out.println("LinkedHashMap1: " + listaNomes);

        // Creating a LinkedHashMap from ohter LinkedHashMap

        LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
        novaListaNomes.put("Jubis", "Jujuba");
        System.out.println("Nova LinkedHashMap2: " + novaListaNomes);
    }
}
