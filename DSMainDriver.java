/**
 * MKMain
 */
public class DSMainDriver {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(5);
        bst.add(3);
        bst.add(7);
        bst.add(1);
        bst.add(6);
        bst.add(2);
        bst.remove(5);
        bst.inOrderTraversal();
        bst.preOrderTraversal();
        bst.postOrderTraversal();
        bst.breadthFirstTraversal();
    }
}
