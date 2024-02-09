/* Zig-Zag Linked List */

public class Linledlist8 {
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

    //function for zig-zag
    public void ZigZag()
    {
        //1.find mid node
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //2.reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nL, nR;

        //3.alternating merging
        while(left!=null && right!=null)
        {
            nL= left.next;
            left.next = right;
            nR = right.next;
            right.next = nL;
            left = nL;
            right = nR;
        }
    }

    public static void main(String[] args) {
        Linledlist8 ll = new Linledlist8();
        ll.addfirst(6);
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        // 
        // 

        ll.print();
        ll.ZigZag();
        ll.print();
        
        
    }
}
