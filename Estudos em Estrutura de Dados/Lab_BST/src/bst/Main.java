package bst;

public class Main {
    public static void main(String[] args){
        var bst = new BSTImpl();
        bst.insert(15);
        bst.insert(18);
        bst.insert(6);
        bst.insert(3);
        bst.insert(2);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);
        bst.insert(9);
        bst.insert(17);
        bst.insert(20);
        bst.preOrder(); // 15, 6, 3, 2, 4, 7, 13, 9, 18, 17, 20
        bst.order();// 2, 3, 4, 6, 7, 9, 13, 15, 17, 18, 20
        bst.postOrder(); // 2, 4, 3, 9, 13, 7, 6, 17, 20, 18, 1
        System.out.println(bst.height());


    }
}
