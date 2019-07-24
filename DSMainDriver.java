/**
 * MKMain
 */
public class DSMainDriver {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(3);
        minHeap.add(31);
        minHeap.add(-12);
        minHeap.add(7);
        while(minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
        // Queue<Integer> pQueue = new PriorityQueue<Integer>(java.util.Collections.reverseOrder());
        // pQueue.offer(5);
        // pQueue.offer(10);
        // pQueue.offer(1);
        // pQueue.offer(3);
        // pQueue.offer(31);
        // pQueue.offer(-12);
        // pQueue.offer(7);
        // while(!pQueue.isEmpty()) {
        //     System.out.println(pQueue.poll());
        // }
        // BinarySearchTree bst = new BinarySearchTree();
        // bst.add(5);
        // bst.add(3);
        // bst.add(7);
        // bst.add(1);
        // bst.add(6);
        // bst.add(2);
        // bst.remove(5);
        // bst.inOrderTraversal();
        // bst.preOrderTraversal();
        // bst.postOrderTraversal();
        // bst.breadthFirstTraversal();
    }
}
