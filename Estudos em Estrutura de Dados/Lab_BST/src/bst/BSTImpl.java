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
		// return boolean result, if true bst is actually empty.
		return root == null;
	}

	private int recursiveHeight(Node node){
		//Create a private recursive method cause original method for interface contract doesn't have parameters
		if(node == null){
			return -1;
		}else{
			return 1 + Math.max(recursiveHeight(node.getLeft()),recursiveHeight(node.getRight()));
		}
	}
	@Override
	public int height() {
		// Simple work, just do something if BST is not empty
		if (!isEmpty()){
			return recursiveHeight(root);
		}
		return 0;
	}

	@Override
	public Node search(Integer value) {
		//Here we have 3 situations, if bst is empty, if root is the search value, if root is not the value,
		//will verify if search value is bigger than auxNode, if yes, go searching on right side, if not, on left side
		if(isEmpty()){
			System.out.println("Árvore vazia.");
			return null;
		}else if(root.getValue().equals(value)){
			return root;
		}else{
			var auxNode = root;
			while(auxNode != null && !auxNode.getValue().equals(value)){
				if(value> auxNode.getValue()){
					auxNode = auxNode.getRight();
				}else{
					auxNode = auxNode.getLeft();
				}
			}
			return auxNode;
		}
	}

	@Override
	public void insert(Integer value) {
		//This method use 3 attributes, currentNode will tell were have free space, newNode will be son of Parent node,
		//and parent node verify if newNode will be in right side or left side
		Node newNode = new Node(value);
		Node currentNode = root;
		Node parentNode = null;

		while(currentNode != null){
			parentNode = currentNode;
			if(newNode.getValue() < currentNode.getValue()){
				currentNode = currentNode.getLeft();
			}else{
				currentNode = currentNode.getRight();
			}
		}
		newNode.setParent(parentNode);
		if(parentNode == null){
			root = newNode;
		}else if(newNode.getValue() < parentNode.getValue()){
			parentNode.setLeft(newNode);
		}else{
			parentNode.setRight(newNode);
		}
		this.size++;
	}

	@Override
	public Node maximum(Node node) {
		//Go full right to discover bigger value in bst
		while(node.getRight() != null) node = node.getRight();
		System.out.println(node.getValue());
		return node;
	}

	@Override
	public Node minimum(Node node) {
		//Go full left to discover smaller value in bst
		while(node.getLeft() != null) node = node.getLeft();
		System.out.println(node.getValue());
		return node;
	}

	@Override
	public Node predecessor(Node node) {
		//if node have a subtree in left, the predecessor will be the max value
		//else, will scale the tree until find predecessor
		if(node.getLeft() != null) return maximum(node.getLeft());

		Node currentParent = node.getParent();
		while(currentParent != null && currentParent.getValue() > node.getValue()){
			currentParent = currentParent.getParent();
		}
		return currentParent;
	}

	@Override
	public Node sucessor(Node node) {
		//if tree have subtree in right side, will be return minimum value on right side
		//else, will scale the tree until find sucessor
		if(node.getRight() != null) return minimum(node.getRight());

		Node currentParent = node.getParent();
		while(currentParent != null && currentParent.getValue() < node.getValue()){
			currentParent = currentParent.getParent();
		}
		return currentParent;
	}

	private void transplant(Node nodeToReplace, Node replacementNode) {
		//This method replaces one node with another within the BST, updating the parent's
		//pointer to link to the new replacement node. It handles the specific cases
		//where the node to replace is the root, a left child, or a right child.
		if (nodeToReplace.getParent() == null) {
			this.root = replacementNode;
		} else if (nodeToReplace == nodeToReplace.getParent().getLeft()) {
			nodeToReplace.getParent().setLeft(replacementNode);
		} else {
			nodeToReplace.getParent().setRight(replacementNode);
		}

		if (replacementNode != null) {
			replacementNode.setParent(nodeToReplace.getParent());
		}
	}

	@Override
	public void remove(Integer value) {
		//This method removes a node by finding it and handling 3 cases: if it has no left child,
		//no right child, or both children. If it has both, it finds the successor to take its
		//place and safely reconnects the subtrees using the transplant method.
		Node nodeToRemove = search(value);

		if (nodeToRemove == null) return;

		if (nodeToRemove.getLeft() == null) {
			transplant(nodeToRemove, nodeToRemove.getRight());
		} else if (nodeToRemove.getRight() == null) {
			transplant(nodeToRemove, nodeToRemove.getLeft());
		} else {
			Node successorNode = minimum(nodeToRemove.getRight());

			if (successorNode.getParent() != nodeToRemove) {
				transplant(successorNode, successorNode.getRight());
				successorNode.setRight(nodeToRemove.getRight());
				successorNode.getRight().setParent(successorNode);
			}

			transplant(nodeToRemove, successorNode);
			successorNode.setLeft(nodeToRemove.getLeft());
			successorNode.getLeft().setParent(successorNode);
		}
		size--;
	}

	private void preOrderRecursive(Node root, List<Integer> nodes){
		//This private recursive method traverses the BST in Pre-Order format
		//It first visits the current root value, then recursively visits the left
		//subtree, and finally recursively visits the right subtree
		if(root != null){
			nodes.add(root.getValue());
			preOrderRecursive(root.getLeft(), nodes);
			preOrderRecursive(root.getRight(), nodes);
		}
	}
	@Override
	public Integer[] preOrder() {
		//This method initializes an empty list and calls the recursive pre-order function
		//if the tree is not empty. After traversal, it converts the list of collected
		//values into an array and returns it.
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
		//This private recursive method traverses the BST in In-Order format.
		//It recursively visits the left subtree, adds the current node value (ascending order),
		//and then recursively visits the right subtree.
		if(root != null){
			orderRecursive(root.getLeft(), nodes);
			nodes.add(root.getValue());
			orderRecursive(root.getRight(), nodes);
		}
	}

	@Override
	public Integer[] order() {
		//This method initializes an empty list and calls the recursive in-order function
		//if the tree is not empty. It returns an array of the elements sorted in ascending order.
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
		//This private recursive method traverses the BST in Post-Order format.
		//It recursively visits the left subtree, then the right subtree, and only
		//adds the current node value after both subtrees are fully visited.
		if(root != null){
			postOrderRecursive(root.getLeft(), nodes);
			postOrderRecursive(root.getRight(), nodes);
			nodes.add(root.getValue());
		}
	}
	@Override
	public Integer[] postOrder() {
		//This method initializes an empty list and calls the recursive post-order function
		//if the tree is not empty. After traversal, it converts the list into an array.
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
	public int size() {return size;} // just return size.

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
