package TDLL;

public class Node {
    private Node next;
    private Node prev;
    private Integer data;

    public Node(){
        next = null;
        prev = null;
        data = null;
    }

    public Node(Integer data){
        this.data = data;
        next = null;
        prev = null;
    }

    public Node getNext() {return next;}
    public void setNext(Node next) {this.next = next;}
    public Node getPrev() {return prev;}
    public void setPrev(Node prev) {this.prev = prev;}
    public Integer getData() {return data;}
    public void setData(Integer data) {this.data = data;}
}
