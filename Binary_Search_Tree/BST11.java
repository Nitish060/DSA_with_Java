/* Merge 2 Binary Search Trees */

import java.util.ArrayList;

public class BST11 {
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

    public static void getInorder(Node root, ArrayList<Integer> inorder)//function for storing inorder sequence
    {
        if(root==null)
        {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder,int st, int end)//function for creating new BST
    {
        if(st>end)
        {
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder, mid+1, end);
        return root;
    }

    public static void preorder(Node root)//function for preorder traversal
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

    public static Node mregeBST(Node root1, Node root2) //function for merging 2 BSTs
    {
        //step1 inorder sequence of BST-1

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step2 inorder sequence of BST-2

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        //step3 merge

        int i=0, j=0;
        ArrayList<Integer> finalarr = new ArrayList<>();

        while(i<arr1.size() && j<arr2.size())
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                finalarr.add(arr1.get(i));
                i++;
            }

            else
            {
                finalarr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size())
        {
            finalarr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size())
        {
            finalarr.add(arr2.get(j));
            j++;
        }

        //staep4 sorted arraylist -> balanced BST
        return createBST(finalarr, 0, finalarr.size()-1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mregeBST(root1, root2);
        preorder(root);
    }
}
