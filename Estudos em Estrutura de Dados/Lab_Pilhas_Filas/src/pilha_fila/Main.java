package pilha_fila;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var queue = new Queue(10);
        queue.enqueue(16);
        queue.enqueue(15);
        queue.dequeue();
        queue.enqueue(13);
        queue.enqueue(12);
        System.out.println(queue.peek());
        queue.print();
        Integer[] array = queue.toArray();
        System.out.println(Arrays.toString(array));
    }
}
