import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    Integer val;

    Node(int val) {
        this.val = val;
    }
}

class BinarySearchTree {
    private Node root = null;

    public void add(int value) {
        this.root = this.add(root, value);
    }

    public void remove(int value) {
        this.root = this.remove(root, value);
    }

    public void inOrderTraversal() {
        this.inOrderTraversal(this.root);
        System.out.print("\b\b");
        System.out.println();
    }

    public void preOrderTraversal() {
        this.preOrderTraversal(this.root);
        System.out.println();
    }

    public void postOrderTraversal() {
        this.postOrderTraversal(this.root);
        System.out.println();
    }

    public void breadthFirstTraversal() {
        this.breadthFirstTraversal(this.root);
        System.out.println();
    }

    private Node add(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value <= root.val) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    private Node remove(Node root, int value) {
        if (root == null)
            return null;
        if (value < root.val) {
            root.left = remove(root.left, value);
            return root;
        } else if (value > root.val) {
            root.right = remove(root.right, value);
            return root;
        }

        if (root.left == null && root.right == null) {
            return null;
        } else if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            Node prev = root.right;
            Node itr = root.right;
            while (itr.left != null) {
                prev = itr;
                itr = itr.left;
            }
            prev.left = itr.right;
            root.val = itr.val;
            return root;
        }
    }

    private void breadthFirstTraversal(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curNode = (Node) queue.remove();
            if (curNode.left != null)
                queue.add(curNode.left);
            if (curNode.right != null)
                queue.add(curNode.right);
            System.out.print(curNode.val + " ");
        }

    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    private void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }

    private void postOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

}