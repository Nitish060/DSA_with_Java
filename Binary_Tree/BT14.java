/*Minimum distance between nodes i.e. number of edges  */

public class BT14 {
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

    public static int lcaDist(Node root, int n)//function for diatance from lowest common ancestor
    {
        if(root==null)
            return -1;
        if(root.data==n)
            return 0;
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist==-1 && rightDist==-1)
            return -1;
        else if(leftDist==-1)
            return rightDist+1;
        else
            return leftDist+1;
    }

    public static int MinDist(Node root, int n1, int n2)//function for calculating minimum distance between nodes
    {
        Node lca = LCA(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1+dist2;
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
      
      int n1=4, n2=6;
      System.out.println(MinDist(root, n1, n2));
    }
}
