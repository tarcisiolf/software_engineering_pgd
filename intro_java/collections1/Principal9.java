package collections1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Principal9 {
    public static void main(String[] args) {

        ArrayList<Integer> numeroArrayList = new ArrayList<>();
        numeroArrayList.add(8);
        numeroArrayList.add(5);
        numeroArrayList.add(8);
        System.out.println("ArrayList: " + numeroArrayList);

        /*
         * 
         * LinkedHashSet<Integer> numerosLinkedHashSet = new
         * LinkedHashSet<>(numeroArrayList);
         * System.out.println("LinkedHashSet: " + numerosLinkedHashSet);
         * 
         */

        LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.addAll(numeroArrayList);
        numerosLinkedHashSet.add(4);
        System.out.println("LinkedHashSet: " + numerosLinkedHashSet);
    }
}
