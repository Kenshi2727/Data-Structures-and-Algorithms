class Node {
    int val;
    Node left = null;
    Node right = null;

    Node(int val) {
        this.val = val;
    }
}

public class bfs {
    public static boolean printLevel(Node root, int level) {
        if (root == null) {
            return false;
        }
        // if level is 1, print the value of the node everytime
        if (level == 1) {
            System.out.print(root.val + " ");
            return true;
        }
        // if level is not 1, recursively call the left and right child of the node
        boolean left = printLevel(root.left, level - 1);
        boolean right = printLevel(root.right, level - 1);
        return left || right;// return true if either left or right is true
        // if left is true, right will not be executed

        /* if both left and right are null then we will return false */
    }

    public static void levelOrderTraversal(Node root) {
        int level = 1;
        while (printLevel(root, level)) {
            level++;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        levelOrderTraversal(root);
    }
}
