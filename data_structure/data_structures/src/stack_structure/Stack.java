package stack_structure;

public class Stack {
    int size;
    int top;
    int vector[];

    Stack(int size) {
        this.top = -1;
        this.size = size;
        this.vector = new int[size];
    }

    public boolean EmptyStack() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean FullStack() {
        if (top >= size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void StackUp(int element) {
        if (!FullStack()) {
            top = top + 1;
            vector[top] = element;
        } else {
            System.out.println("Full Stack");
        }
    }

    public int Unstack() {
        int unstacked = 0;

        if (EmptyStack()) {
            System.out.println("Empty Stack");
        } else {
            unstacked = vector[top];
            top = top - 1;
        }
        return unstacked;
    }

    public void TopElement() {
        if (top >= 0) {
            System.out.println("O elemento do topo é " + vector[top]);
        } else {
            System.out.println("Pilha Vazia");
        }
    }

    public void ShowStack() {
        int i;

        for (i = top; i >= 0; i--) {
            System.out.println("Elemento " + vector[i] + " posição " + i + " da Pilha");
        }
    }
}
