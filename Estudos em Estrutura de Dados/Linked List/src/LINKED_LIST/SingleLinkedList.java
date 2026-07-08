package LINKED_LIST;

public class SingleLinkedList {
    private Node head;
    public SingleLinkedList(){
        this.head = null;
    }
    public void inserir_comeco(int data){
        Node newHead = new Node(data, null);
        newHead.next = this.head;
        this.head = newHead;
    }
    public Node busca(int data){
        Node search = this.head;
        while(search != null && search.data != data){
            search = search.next;
        }
        return search;
    }
}
