/* Diameter of a tree: Number of nodes in the larger path between 2 leaf nodes */
/* Approach-2: TC => O(n) -- creating a Info class */
/* Diameter can pass through root node and without root node also. */

public class BT8 {
    static class Info //Info class for storing diameter and height calculation tasks result at the same time
    {
        int diam; //diameter
        int ht;  //height

        public Info(int diam, int ht)
        {
            this.diam = diam;
            this.ht = ht;
        }
    }

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

    public static Info diameter(Node root) //function for diameter of tree
        {
            if(root==null)
                return new Info(0, 0);
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(diam, ht);
        }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Diameter of tree is "+diameter(root).diam);
    }
}
