/* Check if a linked list is palindrome */

public class Linkedlist3 {
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
        new_Node.next = head;   
        head = new_Node;
    }

    //----> Finding middle node
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    //-----> Checking palindrome
    public boolean check_Palindrome()
    {
        if(head==null && head.next==null)
        {
            return true;
        }
        //find middle
        Node mid = findMid(head);

        //revesre 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr!=null)
        {
            Node Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        Node right = prev;
        Node left = head;

        //Check if 1st half equal 2nd half
        while(right!=null)
        {
            if(left.data!=right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
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
        Linkedlist3 l3 = new Linkedlist3();
        l3.addfirst(1);
        l3.addfirst(2);
        l3.addfirst(3);
        l3.addfirst(3);
        l3.addfirst(2);
        l3.addfirst(1);

        l3.print();
        if(l3.check_Palindrome())
        {
            System.out.println("Linkedlist is palindrome");
        }
        else{
            System.out.println("Linkedlist is not palindrome");
        }
    }
}
