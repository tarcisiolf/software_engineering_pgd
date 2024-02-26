package collections2;

import java.util.TreeMap;

public class Principal3 {
    public static void main(String[] args) {

        TreeMap<String, String> mapaNomes = new TreeMap<>();
        mapaNomes.put("vava", "Oswaldo");
        mapaNomes.put("gisa", "Gisele");
        mapaNomes.put("gigi", "Giovanna");
        mapaNomes.put("giugiu", "Giulianna");

        System.out.println("TreeMap de Nomes: " + mapaNomes);

        System.out.println("Chaves: " + mapaNomes.keySet());
        System.out.println("Valores: " + mapaNomes.values());
        System.out.println("Chave/Valor: " + mapaNomes.entrySet());
    }
}
