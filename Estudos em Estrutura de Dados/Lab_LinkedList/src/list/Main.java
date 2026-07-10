package list;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        lista.insertFirst(10);
        lista.insertLast(20);
        lista.insertFirst(30);
        lista.print();
        System.out.println(lista.search(20));
        lista.removeInicio();
        System.out.println(lista.size());
        lista.print();
    }
}
