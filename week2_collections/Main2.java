package week2_collections;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<String>();

        animais.add("Cachorro");
        animais.add("Cavalo");
        animais.add("Vaca");

        System.out.println("Linkedlist: " + animais);

        animais.add(1, "Gato");

        System.out.println("LinkedList: " + animais);
    }
}
