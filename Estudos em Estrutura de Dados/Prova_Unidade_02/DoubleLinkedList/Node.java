package DoubleLinkedList;

public class Node {
    Integer data;
    Node next;
    Node previous;

    public Node(){
        data = null;
        next = null;
        previous = null;
    }
    public Node(Integer data){
        this.data = data;
        next = null;
        previous = null;
    }
    public Node(Integer data, Node next, Node previous){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }
    @Override
    public String toString(){
        return ""+data;
    }
}
