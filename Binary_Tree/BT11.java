/* Kth level of a tree */

public class BT11 {
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

    public static void K_level(Node root, int level, int k) //function for Kth level nodes
    {
        if(root==null)
            return;
        if(level==k)
        {
            System.out.print(root.data+" ");
            return;
        }
        K_level(root.left, level+1, k);
        K_level(root.right, level+1, k);
    }

    public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
/*
 *                    1
 *                   / \
 *                  2   3
 *                 / \ / \
 *                4  5 6  7
 */
      
      K_level(root, 1, 3);
    }
}
