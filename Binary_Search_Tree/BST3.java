/* Delete a node in Binary Search Tree */

public class BST3 {

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

    public static Node find_Inorder_successor(Node root)//function for finding inorder successor in BST
    {
        while(root.left!=null)
            root = root.left;
        return root;
    }

    public static Node Delete(Node root, int val)//function for deleting node in BST
    {
        if(root.data<val)
            root.right = Delete(root.right, val);
        else if(root.data>val)
            root.left = Delete(root.left, val);
        else
        {
            //case-1 leaf node
            if(root.left==null && root.right==null)
                return null;

            //case-2 single child present
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            
            //case-3 both children present
            Node IS = find_Inorder_successor(root.right);//finding inorder successor
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
        }
        return root;
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
        int values [] = {8,4,2,1,3,6,5,7,12,10,9,11,14,13,15};
        Node root = null;
        for(int i=0; i<values.length; i++)
        {
            root = Insert(root,values[i]);
        }

        System.out.println("Before Deletion");
        inorder(root);
        System.out.println();
        Delete(root, 4);
        System.out.println("After Deletion");
        inorder(root);
    }
}
