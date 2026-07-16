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
		if(!isFull()){
			var new_item = new StackNode(novoElemento);
			if(isEmpty()){
				top = new_item;
				bottom = new_item;
			}else{
				new_item.previous = top;
				top.next = new_item;
				top = new_item;
			}
			size++;
		}else{
			System.out.println("Stack is full.");
		}
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
