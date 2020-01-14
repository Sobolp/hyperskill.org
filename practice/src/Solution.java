import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static String solution(long[] arr) {

        BT bt = new BT();
        for (long i:arr) {
            insert(bt.root,i);
        }
        return null;
    }
    private static class Node {
        private long val;
        private Node left;
        private Node right;

        public Node(long val) {
            this.val = val;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public long getVal() {
            return val;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }
    private static class BT{
        private Node root;

        public BT() {
            this.root = null;
        }

    }
    static void insert(Node temp, long key) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6};
        solution(arr);
    }
}
