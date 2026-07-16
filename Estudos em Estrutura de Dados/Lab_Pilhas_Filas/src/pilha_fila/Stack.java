package pilha_fila;

public class Stack implements Stack_IF{
	//Attributes
	private StackNode top;
	private StackNode bottom;
	private Integer size;
	private int max_size;

	//Class constructor
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
		if (!isEmpty()) {
			Integer[] array = new Integer[size];
			var x = top;
			int i = 0;
			while (x != null) {
				array[i] = x.data;
				i++;
				x = x.next;
			}
			return array;
		}
		return null;
	}
	
	public void print(){
		if(!isEmpty()){
			var print = top;
			while(print!=null){
				System.out.print(print.data+" ");
				print = print.next;
			}
			System.out.println();
		}
	}
}
