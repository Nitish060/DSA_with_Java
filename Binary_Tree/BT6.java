/*Binary Tree Operation
 * -> Height of tree
 * -> Count of nodes of tree
 * -> Sum of nodes of tree
 */

public class BT6 {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) //function for height of trees
        {
            if(root==null)
                return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh)+1;
        }

        public static int count(Node root) //function for count of nodes in tree
        {
            if(root==null)
                return 0;
            int leftCount = count(root.left);
            int rightCount = count(root.right);
            return (leftCount+rightCount+1);
        }

        public static int sum(Node root) //function for sum of nodes in tree
        {
            if(root==null)
                return 0;
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return (leftSum+rightSum+root.data);
        }
        
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height of tree is "+height(root));
        System.out.println("Number of nodes in tree "+count(root));
        System.out.println("Sum of nodes in tree "+sum(root));
    }
}
