package bst;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class BSTImpl implements BST_IF {
	
	private Node root; //nó raiz
	
	public BSTImpl() { //Utilizar este construtor padrão

	}

	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Node search(Integer value) {
		if(root == null){
			System.out.println("Árvore vazia.");
			return null;
		}else if(root.value.equals(value)){
			return root;
		}else{
			var search = root;
			while(search != null && !search.value.equals(value)){
				if(value>search.value){
					search = search.right;
				}else{
					search = search.left;
				}
			}
			return search;
		}
	}

	@Override
	public void insert(Integer value) {
		var z = new Node(value);
		var x = root;
		var y = new Node();
		while(x!= null){
			y = x;
			if(z.value > x.value){
				x = x.left;
			}else{
				x = x.right;
			}
		}
		z.parent = y;
		if(y == null){
			root = z;
		}else if(z.value < y.value){
			y.left = z;
		}else{
			y.right = z;
		}
	}

	@Override
	public Node maximum(Node node) {
		while(node.right != null) node = node.right;
		return node;
	}

	@Override
	public Node minimum(Node node) {
		while(node.left != null) node = node.left;
		return node;
	}

	@Override
	public Node predecessor(Node node) {
		if(node.left != null) return maximum(node.left);
		var y = node.parent;
		while(y != null && y.value>node.value){
			y = y.parent;
		}
		return y;
	}

	@Override
	public Node sucessor(Node node) {
		if(node.right != null) return minimum(node.right);
		var y = node.parent;
		while(y != null && y.value < node.value){
			y = y.parent;
		}
		return y;
	}

	private void transplant(Node u, Node v) {
		// Se 'u' não tem pai, significa que ele é a raiz.
		// Então 'v' se torna a nova raiz.
		if (u.parent == null) {
			this.root = v;
		}
		// Se 'u' for o filho da esquerda do pai dele,
		// 'v' assume essa posição à esquerda.
		else if (u == u.parent.left) {
			u.parent.left = v;
		}
		// Caso contrário, 'u' era o filho da direita.
		else {
			u.parent.right = v;
		}

		// Se 'v' não for vazio, conecta o pai de 'v' ao antigo pai de 'u'.
		if (v != null) {
			v.parent = u.parent;
		}
	}
	
	@Override
	public void remove(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer[] preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] order() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Calcula a quantidade de nós da árvore.
		return 0;
	}
	
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
