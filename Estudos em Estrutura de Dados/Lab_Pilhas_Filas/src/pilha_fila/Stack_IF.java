package pilha_fila;

public interface Stack_IF {
    public Integer pop();
    public void push(Integer novoElemento);
    public boolean isEmpty();
    public boolean isFull();
    public Integer top();
    public Integer[] toArray();
}
