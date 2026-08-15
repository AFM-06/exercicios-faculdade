package DoubleLinkedList;

public interface DoubleLinkedList_Interface {
    public boolean isEmpty();
    public int size();
    public Node search(Integer elemento);
    public void insertFirst(Integer novoElemento);
    public void insertLast(Integer novoElemento);
    public Node remove(Integer elemento);
    public Node removeInicio();
    public Node removeFinal();
    public Node[] toArray();
    public Node getMinimum();
    public Node getMax();
    public Node[] toArrayInverse();
    public void print();
}
