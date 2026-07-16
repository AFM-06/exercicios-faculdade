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
    //Just a get to node data.
    public Integer getDado() {
        return data;
    }
    //On process of make a print method im think e consider using to string, but, I preferred to do without this.
    //thinking in version terms, I decided to not delete him.
    @Override
    public String toString(){
        return ""+this.getDado();
    }
}