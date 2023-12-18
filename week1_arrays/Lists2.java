package week1_arrays;

import java.util.ArrayList;

public class Lists2 {
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<String>();

        bandas.add("Kiss");
        bandas.add("Beatles");
        bandas.add("Iron Maiden");

        System.out.println(bandas);

        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial");

        System.out.println(bandas);

        bandas.remove("Kiss");

        System.out.println(bandas);

        bandas.clear();

        System.out.println(bandas);
    }
}
