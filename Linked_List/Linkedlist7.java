/* Merge Sort on Linked List */

public class Linkedlist7 {
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

    public static Node head;

    public void addfirst(int data)
    {
        Node new_Node = new Node(data);
        if(head == null)
        {
            head = new_Node;
            return;
        }
        new_Node.next = head;   
        head = new_Node;
    }

    //function for merging
    private static Node merge(Node head1, Node head2)
    {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) 
        {
            if(head1.data<=head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }    
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1!=null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!=null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    //function for finding middle node
    public static Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //function for Merge sort
    public Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void print()
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
        Linkedlist7 l1 = new Linkedlist7();
        //l1.addfirst(2);
        l1.addfirst(3);
        l1.addfirst(7);
        l1.addfirst(5);
        l1.addfirst(8);
        System.out.println("LinkedList before sorting");
        l1.print();
        head = l1.mergeSort(head);
        System.out.println("LinkedList after swapping");
        l1.print();
    }
}
