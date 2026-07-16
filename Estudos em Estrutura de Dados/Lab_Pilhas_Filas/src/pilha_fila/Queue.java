package pilha_fila;

public class Queue implements Queue_IF {
	//Attributes
	private QueueNode head;
	private QueueNode tail;
	private final Integer max_size;
	private Integer size;
	//Constructor, initialize size in 0 and max_size it's a personal choice of user
	public Queue(Integer max_size) {
		head = null;
		tail = null;
		this.max_size = max_size;
		this.size = 0;
	}
	// Checks if the queue is full; otherwise, creates an auxiliary node. Then, checks if the queue is empty; if true, sets both
	// to null; in the first 'else' block, sets the node's previous pointer to the tail, makes the tail's next pointer point to the node,
	// and finally, updates the tail to be the node.
	@Override
	public void enqueue(Integer novoElemento) {
		if (!isFull()) {
			var node = new QueueNode(novoElemento);
			if (isEmpty()) {
				tail = node;
				head = node;
			} else {
				node.previous = tail;
				tail.next = node;
				tail = node;
			}
			size++;
		} else {
			System.out.println("Queue is full.");
		}
	}
	// Checks if the queue is empty; otherwise, creates an auxiliary node. Then, checks if the queue contains only one item; if true,
	// sets both to null. In the 'else' block, sets the 'previous' pointer of the next node to null, updates the head to the next node,
	// decrements the size, and returns the removed node.
	@Override
	public Integer dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		} else {
			var aux = head;
			if (head == tail) {
				head = null;
				tail = null;
			} else {
				head.next.previous = null;
				head = head.next;
			}
			size--;
			return aux.data;
		}
	}
	// isEmpty method, just return result boolean from size == 0; if true queue is empty.
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	// isFull method, just return result boolean from size.equals(max_size); if true queue is full.
	@Override
	public boolean isFull() {
		return size.equals(max_size);
	}
	// peek method, return first item of queue, in this case, head.data, but, first verify if queue its empty.
	@Override
	public Integer peek() {
		if (!isEmpty()) {
			return head.data;
		}
		return null;
	}
	//first, check if the queue is empty; otherwise, create an array of Integers of size [size],
	//initialize node x at the head, and traverse to the tail, adding items using index [i].
	@Override
	public Integer[] toArray() {
		if (!isEmpty()) {
			Integer[] array = new Integer[size];
			var x = head;
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
	//Create an auxiliary node named 'print', traverse the queue from head to tail printing the items, and finally, just print a new line.
	public void print(){
		if(!isEmpty()){
			var print = head;
			while(print!=null){
				System.out.print(print.data+" ");
				print = print.next;
			}
			System.out.println();
		}
	}
}
