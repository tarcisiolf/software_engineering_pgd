package stack_structure;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        Stack intStack = new Stack(5);
        int i;
        int input;

        for (i = 1; i <= 5; i++) {
            input = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

            intStack.StackUp(input);
        }

        intStack.ShowStack();
        System.exit(0);
    }
}
