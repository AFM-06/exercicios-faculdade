package list;

import java.util.ArrayList;
import java.util.List;

public class LinkedList implements LinkedList_IF{
	private No head;
	private No tail;
	private int size;
	public LinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Verifica se a lista está vazia. Retorna true se estiver vazia e false caso contrário
		if(tail.equals(null)){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Retorna o tamanho da lista
		return size;
	}

	@Override
	public No search(Integer elemento) {
		// TODO Busca um nó com um determinado valor na lista
		if(!head.data.equals(null)){
			No toSearch = this.head;
			while (!toSearch.equals(null) && !toSearch.data.equals(elemento)){
				toSearch = toSearch.next;
			}
			return toSearch;
		}
		return null;
	}

	@Override
	public void insertFirst(Integer novoElemento) {
		// TODO Implementar a inserção no COMEÇO (head) da lista
		No x = new No(novoElemento,null,null);
		x.next = this.head;
		if(!this.head.equals(null)){
			this.head.previous = x;
		}else{
			this.tail = x;
		}
		size++;
		this.head = x;
		
	}

	@Override
	public void insertLast(Integer novoElemento) {
		// TODO Implementar a inserção no FINAL (tail) da lista
		No x = new No(novoElemento,null,null);
		x.previous = this.tail;
		if(!this.tail.equals(null)){
			this.tail.next = x;
		}else{
			this.head = x;
		}
		size++;
		this.tail = x;
	}

	@Override
	public No remove(Integer elemento) {
		// TODO Remove um nó com um determinado valor. A remoção deve retornar o nó REMOVIDO
		if(this.head.data.equals(elemento)){
			removeInicio();
		}else if(this.tail.data.equals(elemento)){
			removeFinal();
		}else{
			No aux = this.head;
			while (!aux.equals(null) && !aux.data.equals(elemento)){
				aux = aux.next;
			}
			if(!aux.equals(null)){
				No remove = aux;
				aux.previous.next = aux.next;
				aux.next.previous = aux.previous;
				size--;
				return remove;
			}
		}
		return null;
	}

	@Override
	public No removeInicio() {
		// TODO Remoção no início da lista. A remoção deve retornar o nó REMOVIDO
		if(!this.head.equals(null)){
			No aux = this.head;
			this.head = this.head.next;
			if(this.head.equals(null)){
				this.tail = this.head;
			}else{
				this.head.previous = null;
			}
			size--;
			return aux;
		}
		return null;
	}

	@Override
	public No removeFinal() {
		// TODO Remoção no final da lista.A remoção deve retornar o nó REMOVIDO
		if(!this.tail.equals(null)){
			No aux = this.tail;
			this.tail = this.tail.previous;
			if(this.head.equals(null)){
				this.head = this.tail;
			}else{
				this.tail.next = null;
			}
			size--;
			return aux;
		}
		return null;
	}

	@Override
	public No[] toArray() {
		// TODO Retorna um array de nós a partir da lista encadeada.
		return null;
	}
}
