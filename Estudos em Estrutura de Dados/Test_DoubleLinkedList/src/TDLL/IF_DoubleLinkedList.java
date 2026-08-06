package TDLL;

import list.No;

public interface IF_DoubleLinkedList {
    public boolean isEmpty();
    public int size();
    public No search(Integer elemento);
    public void insertFirst(Integer novoElemento);
    public void insertLast(Integer novoElemento);
    public No remove(Integer elemento);
    public No removeInicio();
    public No removeFinal();
    public No[] toArray();
}
