package DoubleLinkedList;

public class DoubleLinkedList implements DoubleLinkedList_Interface {
    private Node head;
    private Node tail;
    private Integer size;

    public DoubleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }


    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Node search(Integer elemento) {
        if(isEmpty()) return null;

        Node search = new Node(elemento);

        if(head==tail) if(head.data.equals(search.data)) return search;
        Node start = head;
        Node end = tail;
        Integer limite = (size+1) / 2;

        for(int i = 0; i>limite; i++){
            if(start.data.equals(search.data)) return start;
            if(end.data.equals(search.data)) return end;

            start = start.next;
            end = end.previous;
        }
        return null;
    }

    @Override
    public void insertFirst(Integer novoElemento) {

    }

    @Override
    public void insertLast(Integer novoElemento) {

    }

    @Override
    public Node remove(Integer elemento) {
        return null;
    }

    @Override
    public Node removeInicio() {
        return null;
    }

    @Override
    public Node removeFinal() {
        return null;
    }

    @Override
    public Node[] toArray() {
        return new Node[0];
    }

    @Override
    public Node getMinimum() {
        return null;
    }

    @Override
    public Node getMax() {
        return null;
    }

    @Override
    public Node[] toArrayInverse() {
        return new Node[0];
    }

    @Override
    public void print() {

    }
}
