public class CountCompleteTreeNodes {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int treeNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkLeftHeight(root);
        int rightHeight = checkrightHeight(root);

        if (leftHeight == rightHeight) {
            return (int) Math.pow(2, leftHeight) - 1;
        }

        return 1 + treeNodes(root.left) + treeNodes(root.right);
    }

    private static int checkLeftHeight(Node root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.left;
        }
        return height;
    }

    private static int checkrightHeight(Node root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.right;
        }
        return height;
    }

    public static void main(String[] args) {
        /*
            1
          /  \
         2    3
        / \  /
       4   5 6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(treeNodes(root));
    }
}
