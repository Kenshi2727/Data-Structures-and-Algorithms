import java.util.*;

class Node {
    int val;
    Node left = null;
    Node right = null;

    Node(int val) {
        this.val = val;
    }
}

public class height {
    public static int heightTree(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
        // height=1+max(height(left),height(right))
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree is:" + heightTree(root));
    }
}
