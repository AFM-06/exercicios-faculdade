package list;

public class LinkedList implements LinkedList_IF{
	private No head;
	private No tail;
	private int size;
	@Override
	public boolean isEmpty() {
		// TODO Verifica se a lista está vazia. Retorna true se estiver vazia e false caso contrário
		return false;
	}

	@Override
	public int size() {
		// TODO Retorna o tamanho da lista
		return 0;
	}

	@Override
	public No search(Integer elemento) {
		// TODO Busca um nó com um determinado valor na lista
		return null;
	}

	@Override
	public void insertFirst(Integer novoElemento) {
		// TODO Implementar a inserção no COMEÇO (head) da lista
		
	}

	@Override
	public void insertLast(Integer novoElemento) {
		// TODO Implementar a inserção no FINAL (tail) da lista
		
	}

	@Override
	public No remove(Integer elemento) {
		// TODO Remove um nó com um determinado valor. A remoção deve retornar o nó REMOVIDO
		return null;
	}

	@Override
	public No removeInicio() {
		// TODO Remoção no início da lista. A remoção deve retornar o nó REMOVIDO
		return null;
	}

	@Override
	public No removeFinal() {
		// TODO Remoção no final da lista.A remoção deve retornar o nó REMOVIDO
		return null;
	}

	@Override
	public No[] toArray() {
		// TODO Retorna um array de nós a partir da lista encadeada.
		return null;
	}
}
