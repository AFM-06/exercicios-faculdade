package DoubleLinkedList;

import list.No;

import java.util.ArrayList;
import java.util.List;

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
        Node newNode = new Node(novoElemento);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void insertLast(Integer novoElemento) {
        Node newNode = new Node(novoElemento);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Node remove(Integer elemento) {
        if(this.head.data.equals(elemento)){
            removeInicio();
        }else if(this.tail.data.equals(elemento)){
            removeFinal();
        }else{
            Node aux = this.head;
            while (aux != null && !aux.data.equals(elemento)){
                aux = aux.next;
            }
            if(aux != null){
                aux.previous.next = aux.next;
                aux.next.previous = aux.previous;
                size--;
                return aux;
            }
        }
        return null;
    }

    @Override
    public Node removeInicio() {
        if(isEmpty()) return null;
        Node removed = head;
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head.next.previous = null;
            head = head.next;
        }
        size--;
        return removed;
    }

    @Override
    public Node removeFinal() {
        if(isEmpty()) return null;
        Node removed = head;
        if(tail == head){
            head = null;
            tail = null;
        }else{
            tail.previous.next = null;
            tail = tail.previous;
        }
        size--;
        return removed;
    }

    @Override
    public Node[] toArray() {
        if(!isEmpty()){
            List<Node> array = new ArrayList<>();
            Node x = this.head;
            while(x != null){
                array.add(x);
                x = x.next;
            }
            return array.toArray(new Node[0]);
        }
        return null;
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
