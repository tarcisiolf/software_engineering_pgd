package linked_list;

import javax.swing.JOptionPane;

public class Example {
    public static void main(String[] args) {
        LinkedList intList = new LinkedList();
        int i, num;

        for (i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

            if (num % 3 == 0) {
                intList.InsertLast(new Node(num));
            }
        }
        intList.ShowList();
        System.exit(0);
    }
}
