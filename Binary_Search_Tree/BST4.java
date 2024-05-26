/* Print in Range in BST */

public class BST4 {
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

    public static void Print_in_Range(Node root, int k1, int k2)
    {
        if(root==null)
            return;
        if(root.data>=k1 && root.data<=k2)
        {
            Print_in_Range(root.left, k1, k2);
            System.out.print(root.data+" ");
            Print_in_Range(root.right, k1, k2);
        }
        else if(root.data<k1)
        {
            Print_in_Range(root.left, k1, k2);
            Print_in_Range(root.right, k1, k2);
        }
        else
        {
            Print_in_Range(root.right, k1, k2);
            Print_in_Range(root.left, k1, k2);
        }
    }

    public static void inorder(Node root)//function for inorder traversal
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values [] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<values.length; i++)
        {
            root = Insert(root,values[i]);
        }
        int k1=5, k2=12;
        //inorder(root);
        System.out.println("Nodes between "+k1+" and "+k2+" is");
        Print_in_Range(root, k1, k2);
    }
}
