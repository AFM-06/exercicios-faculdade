package pilha_fila;

public class Stack implements Stack_IF{
	//Attributes
	private StackNode top;
	private StackNode bottom;
	private Integer size;
	private final int max_size;

	//Class constructor
	public Stack(int max_size) {
		top = null;
		bottom = null;
		size = 0;
		this.max_size = max_size;
	}

	// Checks if the stack is empty; otherwise, creates an auxiliary node and checks if the stack contains only one item (top == base). If so,
	// sets both to null; otherwise, the node preceding the top is set to point to null and is updated to become the new top.
	@Override
	public Integer pop() {
		if(isEmpty()){
			System.out.println("Stack is empty.");
			return null;
		}else{
			var aux = top;
			if(top == bottom){
				top = null;
				bottom = null;
			}else{
				top.previous.next = null;
				top = top.next;
			}
			size--;
			return aux.data;
		}
	}
	// First, check if the stack is not full; if it isn't, create a node named new_item and check again—but this time,
	// check if the stack is empty. If it is, the top and the base will represent the same element; otherwise, new_item.previous will point to
	// the top of the stack, the top of the stack will point back, and finally, new_item will effectively become the top of the stack.
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
	//Just return boolean result of size == max_size, if true Stack is full.
	@Override
	public boolean isFull() {
		return size == max_size;
	}
	//Return top.data, no less no more.
	@Override
	public Integer top() {
		return top.data;
	}
	//first, check if the queue is empty; otherwise, create an array of Integers of size [size],
	//initialize node x at the top, and traverse to the bottom, adding items using index [i].
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
	// Helper method to print the stack. First, it checks if the stack is not empty, then creates an auxiliary node named 'print'
	// initialized at the top and traverses the entire stack down to the base, printing the node data.
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
