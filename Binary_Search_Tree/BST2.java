/* Search key in a Binary Search Tree */

public class BST2 {
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node Insert(Node root, int val)//function for inserting node into BST
    {
        if(root==null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data>val)
        {
            //left subtree
            root.left = Insert(root.left,val);
        }
        else
        {
            //right subtree
            root.right = Insert(root.right,val);
        }
        return root;
    }

    public static boolean Search(Node root, int key)//function for searching key in BST
    {
        if(root==null)
            return false;
        if(root.data==key)
            return true;
        if(root.data>key)
            return Search(root.left, key);
        else
            return Search(root.right, key);
    }

    public static void main(String[] args) {
        int values [] = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++)
        {
            root = Insert(root,values[i]);
        }
/*
 *               5
 *              / \
 *             1   7
 *             \ 
 *              3
 *             / \
 *            2   4
 */
        if(Search(root, 1))
            System.out.println("Key found");
        else
            System.out.println("Key not found");
    }
}
