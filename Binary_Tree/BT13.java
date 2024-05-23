/* Lowest Common Ancestor 
 * Approach-2: 1st ancestor-> subtree containing n1 and n2
 *             Not use of extra space
 *             TC: O(n)
*/

public class BT13 {
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

    public static Node LCA(Node root, int n1, int n2)//function for finding lowest common ancestor
    {
        if(root==null || root.data==n1 || root.data==n2)
            return root;
        Node leftLca = LCA(root.left, n1, n2);
        Node rightLca = LCA(root.right, n1, n2);

        //leftLca = valid but rightLca = null

        if(rightLca==null)
            return leftLca;
        if(leftLca==null)
            return rightLca;
        return root;
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
      
      int n1=4, n2=5;
      System.out.println(LCA(root, n1, n2).data);;
    }
}
