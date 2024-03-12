package linked_list;

public class LinkedList {
    Node first, last;

    LinkedList(){
        first = null;
        last = null;
    }

    public boolean EmptyList(){
        if (first == null && last == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Destroy(){
        first = null;
        last = null;
    }

    public int CountNodes(){
        int size = 0;
        Node NoTemp = first;

        while (NoTemp != null) {
            size += size +1;
            NoTemp = NoTemp.next;
        }

        return size;
    }

    public void ShowList(){
        int i = 1;
        Node NoTemp = first;

        while (NoTemp != null) {
            System.out.println("Elemento " + NoTemp.element + " posição " + i);
            NoTemp = NoTemp.next;
            i = i + 1;
        }
    }

    public void FirstElement(){
        if (!EmptyList()) {
            System.out.println("O primeiro elemento é " + first.element);
        } else {
            System.out.println("Lista Ligada Vazia");
        }
    }

    public void LastElement(){
        if (!EmptyList()) {
            System.out.println("O primeiro elemento é " + last.element);
        } else {
            System.out.println("Lista Ligada Vazia");
        }
    }

    public void InsertBegin (Node newNode){
        if (EmptyList()) {
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void InsertLast (Node newNode){
        if (EmptyList()) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
    }

    public void InsertMiddle (Node newNode, int position){
        Node NoTemp = first;
        int numberNodes, posAux = 1;

        numberNodes = CountNodes();

        if (position <= 1) {
            InsertBegin(newNode);
        } else {

            if (position > numberNodes){
                InsertLast(newNode);

            } else {

                while (posAux < (position - 1)) {
                    NoTemp = NoTemp.next;
                    posAux = posAux + 1;
                }
                newNode.next = NoTemp.next;
                NoTemp.next = newNode;
            }
        }
    }

    public void Remove(int element){
        Node NoTemp = first;
        Node NoAnt = null;

        if (first.element == element) {
            first = first.next;
        } else {
            while (NoTemp != null && NoTemp.element != element) {
                NoAnt = NoTemp;
                NoTemp = NoTemp.next;
            }
            if (NoTemp != null) {
                NoAnt.next = NoTemp.next;
            }
            if (NoTemp == last) {
                last = NoAnt;
            }
        }
    }

    public Node SearchNode(int element){
        int i = 1;
        Node NoTemp = first;

        while (NoTemp != null) {
            if (NoTemp.element == element) {
                System.out.println("No " + NoTemp.element + " posição " + i);
                return NoTemp;
            }
            i = i + 1;
            NoTemp = NoTemp.next;
        }
        return null;
    }
}
