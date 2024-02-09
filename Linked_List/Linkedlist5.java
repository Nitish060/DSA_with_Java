/* Remove a loop in a Linked List */

public class Linkedlist5 {
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

    public static void removeCycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
            {
                cycle=true;
                break;
            }
        }
        if(cycle==false)
        {
            return;
        }

        //corner case-->  1->2->3->1
        if(slow==head)
        {
            fast = fast.next;
            while(fast.next!=slow)
            {
                fast = fast.next; 
            }
            fast.next = null;
            return;
        }
        slow = head;
        Node prev = null ;
        while(slow!=fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public void print(Node head)
    {
        if(head==null)
            System.out.println("Linked list is empty");
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Linkedlist5 l5 = new Linkedlist5();
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = head.next;
       removeCycle(head);
       l5.print(head);
    }
}
