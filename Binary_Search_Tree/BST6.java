/* Mirror a Binary Search Tree */

public class BST6 {
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

    public static Node createMirror(Node root)//function for mirroring of BST
    {
        if(root==null)
            return null;
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

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
        int values [] = {8,5,3,6,10,11};
        Node root = null;
        for(int i=0; i<values.length; i++)
        {
            root = Insert(root,values[i]);
        }
        System.out.println("Before mirroring");
        inorder(root);
        
        System.out.println();
        createMirror(root);
        System.out.println("After mirroring");
        inorder(root);
    }
}
