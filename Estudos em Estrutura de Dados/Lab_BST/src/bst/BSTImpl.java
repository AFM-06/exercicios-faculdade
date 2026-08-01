package bst;

import java.util.*;

public class BSTImpl implements BST_IF {
	private Node root;
	private Integer size = 0;

	public BSTImpl() { //Utilizar este construtor padrão
		this.root = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	private int recursiveheight(Node node){
		if(node == null){
			return -1;
		}else{
			return 1 + Math.max(recursiveheight(node.getLeft()),recursiveheight(node.getRight()));
		}
	}
	@Override
	public int height() {
		if (!isEmpty()){
			return recursiveheight(root);
		}
		return 0;
	}

	@Override
	public Node search(Integer value) {
		if(root == null){
			System.out.println("Árvore vazia.");
			return null;
		}else if(root.getValue().equals(value)){
			return root;
		}else{
			var search = root;
			while(search != null && !search.getValue().equals(value)){
				if(value>search.getValue()){
					search = search.getRight();
				}else{
					search = search.getLeft();
				}
			}
			return search;
		}
	}

	@Override
	public void insert(Integer value) {
		var z = new Node(value);
		Node x = root;
		Node y = null;
		while(x != null){
			y = x;
			if(z.getValue() < x.getValue()){
				x = x.getLeft();
			}else{
				x = x.getRight();
			}
		}
		z.setParent(y);
		if(y == null){
			root = z;
		}else if(z.getValue() < y.getValue()){
			y.setLeft(z);
		}else{
			y.setRight(z);
		}
		this.size++;
	}

	@Override
	public Node maximum(Node node) {
		while(node.getRight() != null) node = node.getRight();
		System.out.println(node.getValue());
		return node;
	}

	@Override
	public Node minimum(Node node) {
		while(node.getLeft() != null) node = node.getLeft();
		System.out.println(node.getValue());
		return node;
	}

	@Override
	public Node predecessor(Node node) {
		if(node.getLeft() != null) return maximum(node.getLeft());
		var y = node.getParent();
		while(y != null && y.getValue()>node.getValue()){
			y = y.getParent();
		}
		return y;
	}

	@Override
	public Node sucessor(Node node) {
		if(node.getRight() != null) return minimum(node.getRight());
		var y = node.getParent();
		while(y != null && y.getValue() < node.getValue()){
			y = y.getParent();
		}
		return y;
	}

	private void transplant(Node u, Node v) {
		// Se 'u' não tem pai, significa que ele é a raiz.
		// Então 'v' se torna a nova raiz.
		if (u.getParent() == null) {
			this.root = v;
		}
		// Se 'u' for o filho da esquerda do pai dele,
		// 'v' assume essa posição à esquerda.
		else if (u == u.getParent().getLeft()) {
			u.getParent().setLeft(v);
		}
		// Caso contrário, 'u' era o filho da direita.
		else {
			u.getParent().setRight(v);
		}

		// Se 'v' não for vazio, conecta o pai de 'v' ao antigo pai de 'u'.
		if (v != null) {
			v.setParent(u.getParent());
		}
	}
	
	@Override
	public void remove(Integer value) {
		// 1. Encontra o nó 'z' que será removido usando o método de busca da classe
		Node z = search(value);

		// Se não achou, encerra o método
		if (z == null) {
			return;
		}

		// Caso 1: Não tem filho à esquerda
		if (z.getLeft() == null) {
			transplant(z, z.getRight());
		}
		// Caso 2: Não tem filho à direita
		else if (z.getRight() == null) {
			transplant(z, z.getLeft());
		}
		// Caso 3: Tem os dois filhos
		else {
			// Encontra o sucessor 'y' usando a função minimum que você já tem
			Node y = minimum(z.getRight());

			// Se 'y' não for o filho imediato de 'z'
			if (y.getParent() != z) {
				transplant(y, y.getRight());
				y.setRight(z.getRight());
				y.getRight().setParent(y);
			}

			// Finalmente, substitui 'z' por 'y'
			transplant(z, y);
			y.setLeft(z.getLeft());
			y.getLeft().setParent(y);
		}
		size--;
	}

	private void preOrderRecursive(Node root, List<Integer> nodes){
		if(root != null){
			nodes.add(root.getValue());
			preOrderRecursive(root.getLeft(), nodes);
			preOrderRecursive(root.getRight(), nodes);
		}
	}
	@Override
	public Integer[] preOrder() {
		if(!isEmpty()){
			List<Integer> nodes = new ArrayList<>();

			preOrderRecursive(root,nodes);

			Integer[] array = nodes.toArray(new Integer[0]);

			System.out.println(Arrays.toString(array));
			return array;
		}
		return null;
	}

	private void orderRecursive(Node root, List<Integer> nodes){
		if(root != null){
			orderRecursive(root.getLeft(), nodes);
			nodes.add(root.getValue());
			orderRecursive(root.getRight(), nodes);
		}
	}

	@Override
	public Integer[] order() {
		if(!isEmpty()){
			List<Integer> nodes = new ArrayList<>();

			orderRecursive(root,nodes);

			Integer[] array = nodes.toArray(new Integer[0]);

			System.out.println(Arrays.toString(array));
			return array;
		}
		return null;
	}

	private void postOrderRecursive(Node root, List<Integer> nodes){
		if(root != null){
			postOrderRecursive(root.getLeft(), nodes);
			postOrderRecursive(root.getRight(), nodes);
			nodes.add(root.getValue());
		}
	}
	@Override
	public Integer[] postOrder() {
		if(!isEmpty()){
			List<Integer> nodes = new ArrayList<>();

			postOrderRecursive(root,nodes);

			Integer[] array = nodes.toArray(new Integer[0]);

			System.out.println(Arrays.toString(array));
			return array;
		}
		return null;
	}

	@Override
	public int size() {return size;}

	/**
	 * Método de brinde! Não modificar!
	 * Este método implementa uma busca em largura usando uma fila e pode
	 * ajudar vocês a testarem a implementação da árvore.
	 * @return
	 */
    public ArrayList<Integer> bfs() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Deque<Node> queue = new LinkedList<Node>();

        if (!isEmpty()) {
            queue.addLast(this.root);
            while (!queue.isEmpty()) {
                Node current = queue.removeFirst();

                list.add(current.getValue());

                if(current.getLeft() != null)
                    queue.addLast(current.getLeft());
                if(current.getRight() != null)
                    queue.addLast(current.getRight());
            }
        }
        return list;
    }

}
