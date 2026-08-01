package bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BSTImplTest {

    private BST_IF bst;

    // Esse método roda ANTES de cada teste, garantindo uma árvore limpa
    @BeforeEach
    public void setUp() {
        bst = new BSTImpl();
    }

    @Test
    public void testInsertAndSize() {
        assertTrue(bst.isEmpty(), "Árvore deve começar vazia");
        assertEquals(0, bst.size(), "Tamanho inicial deve ser 0");

        bst.insert(15);
        assertFalse(bst.isEmpty(), "Árvore não deve estar vazia após inserção");
        assertEquals(1, bst.size());

        bst.insert(10);
        bst.insert(20);
        assertEquals(3, bst.size(), "Tamanho deve ser 3 após 3 inserções");
    }

    @Test
    public void testSearch() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);

        Node resultEncontrado = bst.search(6);
        assertNotNull(resultEncontrado, "Deve encontrar o nó 6");
        assertEquals(6, resultEncontrado.getValue(), "Valor do nó deve ser 6");

        Node resultNaoEncontrado = bst.search(100);
        assertNull(resultNaoEncontrado, "Não deve encontrar um nó que não existe");
    }

    @Test
    public void testHeight() {
        assertEquals(0, bst.height(), "Altura de árvore vazia deve ser 0 pela implementação atual");

        bst.insert(15);
        assertEquals(0, bst.height(), "Altura de árvore com 1 nó deve ser 0");

        bst.insert(6);
        bst.insert(18);
        assertEquals(1, bst.height(), "Altura deve ser 1 após inserir filhos diretos");

        bst.insert(3);
        assertEquals(2, bst.height(), "Altura deve ser 2 após inserir nó no 3º nível");
    }

    @Test
    public void testMinAndMax() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);
        bst.insert(3);
        bst.insert(7);
        bst.insert(20);

        // Pega a raiz para passar como parâmetro
        Node root = bst.search(15);

        Node min = bst.minimum(root);
        assertEquals(3, min.getValue(), "O mínimo da árvore deve ser 3");

        Node max = bst.maximum(root);
        assertEquals(20, max.getValue(), "O máximo da árvore deve ser 20");
    }

    @Test
    public void testPredecessorAndSuccessor() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);
        bst.insert(3);
        bst.insert(7);

        Node node15 = bst.search(15);
        Node node7 = bst.search(7);
        Node node6 = bst.search(6);

        // Sucessor do 7 (não tem filho à direita, sobe para o pai/avô que seja maior)
        assertEquals(15, bst.sucessor(node7).getValue(), "O sucessor de 7 deve ser 15");

        // Antecessor do 15 (máximo da subárvore esquerda)
        assertEquals(7, bst.predecessor(node15).getValue(), "O antecessor de 15 deve ser 7");

        // Sucessor do 6 (mínimo da subárvore direita)
        assertEquals(7, bst.sucessor(node6).getValue(), "O sucessor de 6 deve ser 7");
    }

    @Test
    public void testRemoveLeaf() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);

        bst.remove(6); // 6 é folha
        assertEquals(2, bst.size(), "Tamanho deve diminuir para 2");
        assertNull(bst.search(6), "Nó 6 não deve mais existir na árvore");
    }

    @Test
    public void testRemoveNodeWithOneChild() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(3); // 6 tem apenas o filho 3

        bst.remove(6);
        assertEquals(2, bst.size(), "Tamanho deve diminuir para 2");
        assertNull(bst.search(6), "Nó 6 não deve mais existir");

        // A raiz 15 deve agora ter o 3 como filho esquerdo
        Node root = bst.search(15);
        assertEquals(3, root.getLeft().getValue(), "15 deve apontar para 3 à esquerda");
    }

    @Test
    public void testRemoveNodeWithTwoChildren() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);
        bst.insert(3);
        bst.insert(7); // 6 tem filhos 3 e 7

        bst.remove(6);
        assertEquals(4, bst.size());
        assertNull(bst.search(6));

        // Pela lógica de sucessor da sua implementação, o 6 deve ser substituído pelo 7
        Node root = bst.search(15);
        assertEquals(7, root.getLeft().getValue(), "Raiz 15 deve apontar para o sucessor 7 à esquerda");
        assertEquals(3, root.getLeft().getLeft().getValue(), "O nó 3 deve ser filho esquerdo do 7");
    }

    @Test
    public void testTraversals() {
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);
        bst.insert(3);
        bst.insert(7);

        // PreOrder: Raiz, Esquerda, Direita
        Integer[] expectedPreOrder = {15, 6, 3, 7, 18};
        assertArrayEquals(expectedPreOrder, bst.preOrder(), "PreOrder incorreto");

        // Order (Em ordem): Esquerda, Raiz, Direita (deve estar ordenado)
        Integer[] expectedOrder = {3, 6, 7, 15, 18};
        assertArrayEquals(expectedOrder, bst.order(), "Order incorreto");

        // PostOrder: Esquerda, Direita, Raiz
        Integer[] expectedPostOrder = {3, 7, 6, 18, 15};
        assertArrayEquals(expectedPostOrder, bst.postOrder(), "PostOrder incorreto");
    }
}