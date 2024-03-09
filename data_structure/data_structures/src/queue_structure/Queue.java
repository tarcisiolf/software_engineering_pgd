package queue_structure;

import javax.swing.JOptionPane;

public class Queue {

    int size, begin, end, total;
    int vector[];

    Queue(int size) {
        this.begin = 0;
        this.end = 0;
        this.total = 0;
        this.size = size;
        this.vector = new int[size];
    }

    public boolean EmptyQueue() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean FullQueue() {
        if (total >= size) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(int element) {
        vector[end] = element;
        end = end + 1;
        total = total + 1;

        if (end >= size) {
            end = 0;
        } else {
            System.out.println("Fila Cheia");
        }
    }

    public int Dequeue() {
        int dequeued = 0;
        if (EmptyQueue()) {
            System.out.println("Fila Vazia");
        } else {
            dequeued = vector[begin];
            begin = begin + 1;
            total = total - 1;
            if (begin >= size) {
                begin = 0;
            }
        }
        return dequeued;
    }

    public void FirstElement() {
        if (!EmptyQueue()) {
            System.out.println("O primeiro elemento é " + vector[begin]);
        } else {
            System.out.println("Fila Vazia");
        }
    }

    public void ShowQueue() {
        int i, aux;

        aux = begin;

        for (i = 0; i <= total; i++) {
            JOptionPane.showMessageDialog(null, "Elemento " + vector[aux] + " posição " + i);

            aux = aux + 1;
            if (aux >= size) {
                aux = 0;
            }
        }
    }

    public static void main(String[] args) {
        Queue intQueue = new Queue(10);
        int i, input = 0;

        for (i = 1; i <= 10; i++) {
            input = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

            if (input % 2 == 0) {
                intQueue.Enqueue(input);
            }
        }
        intQueue.ShowQueue();
        System.exit(0);
    }
}
