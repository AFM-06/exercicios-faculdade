package TDLL;

import list.No;

public class DoubleLinkedList implements IF_DoubleLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Node search(Integer elemento) {
        if(isEmpty()) return null;

        Node start = head;
        Node end = tail;
        int limite = (size+1)/2;

        for(int i = 0;i < limite; i++){
            if(start.getData().equals(elemento)) return start;
            if(end.getData().equals(elemento)) return end;

            start = start.getNext();
            end = end.getPrev();
        }
        return null;
    }

    @Override
    public void insertFirst(Integer novoElemento) {
        Node newNode = new Node(novoElemento);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    @Override
    public void insertLast(Integer novoElemento) {

    }

    @Override
    public No remove(Integer elemento) {
        return null;
    }

    @Override
    public No removeInicio() {
        return null;
    }

    @Override
    public No removeFinal() {
        return null;
    }

    @Override
    public No[] toArray() {
        return new No[0];
    }
}
