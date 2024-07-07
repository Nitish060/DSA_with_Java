/* Validate a Binary Search Tree */

public class BST7 {

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

    public static Node Insert(Node root, int val)//function for inserting nodes into BST
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

    public static boolean isValidBST(Node root, Node min, Node max)//function to validate BST
    {
        if(root==null)
        {
            return true;
        }

        if(min!=null && root.data <= min.data)
            return false;
        
        else if(max!=null && root.data>=max.data)
            return false;
        
        return isValidBST(root.left, min, root)&&isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values [] = {8,5,3,6,10,11};
        Node root = null;
        for(int i=0; i<values.length; i++)
        {
            root = Insert(root,values[i]);
        }

        if(isValidBST(root, null, null))
            System.out.println("BST is Valid");
        
        else
            System.out.println("BST is not Valid");
    }
}
