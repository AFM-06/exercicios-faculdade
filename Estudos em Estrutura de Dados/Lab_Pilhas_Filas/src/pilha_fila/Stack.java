package pilha_fila;

public class Stack implements Stack_IF{
	
	public Stack(int max_size) {
		//TODO Implemente a partir deste construtor
	}
	
	@Override
	public Integer pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Integer novoElemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean isFull() {
		return size == max_size;
	}

	@Override
	public Integer top() {
		return top.data;
	}

	@Override
	public Integer[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
