package pilha_fila;

public class QueueNode {
    Integer data;
    QueueNode next;
    QueueNode previous;

    public QueueNode(Integer data) {
        this.data = data;
        next = null;
        previous = null;
    }
    public QueueNode() {
        data = null;
        next = null;
        previous = null;
    }
    public Integer getDado() {
        return data;
    }
    @Override
    public String toString(){
        return ""+this.getDado();
    }
}