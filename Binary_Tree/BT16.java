/* Transform to Sum tree 
 * => each node = sum of left and right subtrees
*/

public class BT16 {
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

public static int transform(Node root)//function for transformation of tree
{
    if(root==null)
        return 0;
    int left_child = transform(root.left);
    int right_child = transform(root.right);

    int data = root.data;

    int new_left = root.left == null ? 0 : root.left.data;
    int new_right = root.right == null ? 0 : root.right.data;

    root.data = new_left+left_child+new_right+right_child;

    return data;
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

     transform(root);
     preorder(root);
/*
          Tree after transformation-
 *                    27
 *                   / \
 *                  9   13
 *                 / \ / \
 *                0  0 0  0
 */

    }
}
