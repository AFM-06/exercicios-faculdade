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
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public No search(Integer elemento) {
        return null;
    }

    @Override
    public void insertFirst(Integer novoElemento) {

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
