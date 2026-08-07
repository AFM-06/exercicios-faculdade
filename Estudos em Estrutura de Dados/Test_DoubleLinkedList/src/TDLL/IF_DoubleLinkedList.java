package TDLL;

import list.No;

public interface IF_DoubleLinkedList {
    public boolean isEmpty();
    public int size();
    public Node search(Integer elemento);
    public void insertFirst(Integer novoElemento);
    public void insertLast(Integer novoElemento);
    public Node remove(Integer elemento);
    public Node removeInicio();
    public Node removeFinal();
    public Node[] toArray();
}
