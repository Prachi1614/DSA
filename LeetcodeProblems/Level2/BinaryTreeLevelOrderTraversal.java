import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<List<Integer>> res(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> level = new ArrayList<>();

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                ans.add(level);
                if (q.isEmpty()) {
                    break;
                } else {
                    level = new ArrayList<>();
                    q.add(null);
                }
            }
            else{
                level.add(curr.data);
                
                if(curr.left != null){
                   q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ /
         * 4 5 6
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        
        BinaryTreeLevelOrderTraversal bin = new BinaryTreeLevelOrderTraversal();
        
        List<List<Integer>> result = bin.res(root);
        System.out.println(result);
    }
}
