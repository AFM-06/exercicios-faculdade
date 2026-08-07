package TDLL;

public class Main {
    public static void main(String[] args) {
        var dll = new DoubleLinkedList();
        dll.insertLast(10);
        dll.insertLast(11);
        dll.insertLast(12);
        dll.insertFirst(9);
        dll.print();
    }
}
