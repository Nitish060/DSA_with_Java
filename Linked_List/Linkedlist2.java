public class Linkedlist2 {
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
    public static Node tail; 
    public static int size;

    public void addfirst(int data)
    {
        Node new_Node = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = new_Node;
            return;
        }
        new_Node.next = head;   //link
        head = new_Node;
    }

    /* Reversing a linked list function */
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head; //assignment from right to left in java
        Node Next;
        while(curr!=null)
        {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
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
        Linkedlist2 l2 = new Linkedlist2();
        l2.addfirst(10);
        l2.addfirst(9);
        l2.addfirst(8);
        l2.addfirst(7);
        l2.addfirst(6);
        l2.addfirst(5);
        l2.addfirst(4);
        l2.addfirst(3);
        l2.addfirst(2);
        l2.addfirst(1);

        System.out.println("Linkedlist before reversing");
        l2.print();
        l2.reverse();
        System.out.println("Linkedlist after reversing");
        l2.print();
       
    }
}
