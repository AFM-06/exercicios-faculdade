package pilha_fila;

public class Queue implements Queue_IF{
	private QueueNode head;
	private QueueNode tail;
	private Integer max_size;
	private Integer size;

	public Queue(Integer max_size) {
		head = new QueueNode();
		tail = new QueueNode();
		this.max_size = 10;
		this.size = 0;
	}
	
	@Override
	public void enqueue(Integer novoElemento) {
		if(!isFull()){
			var node = new QueueNode(novoElemento);
			if(tail == null){
				tail = node;
				head = node;
			}else{
				node.previous = tail;
				tail.next = node;
				tail = node;
			}
			size++;
		}else{
			System.out.println("Queue is full.");
		}
	}

	@Override
	public Integer dequeue() {
		if(isEmpty()){
			System.out.println("Queue is empty.");
			return null;
		}else{
			var aux = head;
			if(head == tail){
				head = null;
				tail = null;
			}else{
				head.next.previous = null;
				head = head.next;
			}
			size--;
			return aux.data;
		}
	}

	@Override
	public boolean isEmpty() {
        return size == 0;
    }

	@Override
	public boolean isFull() {
        return size.equals(max_size);
    }

	@Override
	public Integer peek() {
		if (!isEmpty()) {
			return head.data;
		}
		return null;
	}

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

}
