package pilha_fila;

public class StackNode {
	Integer data;
    StackNode next;
    StackNode previous;

    public StackNode(){
        data = null;
        next = null;
        previous = null;
    }

    public StackNode(Integer data){
        this.data = data;
        next = null;
        previous = null;
    }
}
