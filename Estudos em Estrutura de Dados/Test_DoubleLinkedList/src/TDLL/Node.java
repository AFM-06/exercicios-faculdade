package TDLL;

public class Node {
    private Node next;
    private Node previous;
    private Integer data;

    public Node(){
        next = null;
        previous = null;
        data = null;
    }
    
    public Node(Integer data){
        this.data = data;
        next = null;
        previous = null;
    }

    public Node getNext() {return next;}
    public void setNext(Node next) {this.next = next;}
    public Node getPrevious() {return previous;}
    public void setPrevious(Node previous) {this.previous = previous;}
    public Integer getData() {return data;}
    public void setData(Integer data) {this.data = data;}
}
