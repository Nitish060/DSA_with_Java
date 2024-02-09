/* Detect a cycle/loop in a linked list */

public class Linkedlist4 {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; //points at 1st node 
    public static Node tail; //points at last node


    public static boolean isCycle()
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true; //cycle exist
            }
        }
        return false; //cycle doesn't exist
    }

    public static void main(String[] args) {
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = head.next;

       System.out.println("Cycle exist "+isCycle());
    }
}
