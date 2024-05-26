/* Root to Leaf node path */

import java.util.*;

public class BST5 {
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


    public static void printPath(ArrayList<Integer> path)//function for printing path
    {
        for(int i=0; i<path.size(); i++)
            System.out.print(path.get(i)+"->");
        System.out.println("Null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path)//function for finding path from root to leaf
    {
        if(root==null)
            return;
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }

        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values [] = {8,4,2,1,3,6,5,7,12,10,9,11,14,13,15};
        Node root = null;
        for(int i=0; i<values.length; i++)
        {
            root = Insert(root,values[i]);
        }
        ArrayList<Integer> path = new ArrayList<>();
        printRoot2Leaf(root, path);
    }
}
