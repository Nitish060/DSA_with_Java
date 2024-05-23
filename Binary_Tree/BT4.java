/* Postorder Tree Traversal of Binary Tree */

public class BT4 {
    
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

    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[]) //function for building trees
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void postorder(Node root)//function for postorder traversal
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; //-1 represents null node
        //BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.postorder(root);
    }
}
