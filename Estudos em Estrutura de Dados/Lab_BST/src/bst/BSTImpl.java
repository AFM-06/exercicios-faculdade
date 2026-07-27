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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node maximum(Node raiz) {
		while(raiz.right != null) raiz = raiz.right;
		return raiz;
	}

	@Override
	public Node minimum(Node raiz) {
		while(raiz.left != null) raiz = raiz.left;
		return raiz;
	}

	@Override
	public Node predecessor(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node sucessor(Node node) {
		// TODO Auto-generated method stub
		return null;
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
