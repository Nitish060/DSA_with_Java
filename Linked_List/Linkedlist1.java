/* ------------ Basics of Linkedlist Data Structure ------------ */

public class Linkedlist1 {
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


    //adding node at head
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


    //adding node at tail
    public void addlast(int data)
    {
        Node new_Node = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = new_Node;
            return;
        }
        tail.next = new_Node;   //link
        tail = new_Node;
    }


    //adding node in the middle
    public  void addmiddle(int idx, int data)
    {
        if(idx==0)
        {
            addfirst(data);
            return;
        }
        Node new_Node = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1)
        {
            temp = temp.next;
            i++;
        }
        new_Node.next = temp.next;
        temp.next = new_Node;
    }

    //remove node at head
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

            int val = head.data;
            head = head.next;
            size--;
            return val;
    }

    //rremove node at tail
    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++)
        {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val; 
    }

    //find and remove nth node from end --- size-n+1 from start
    public void delNfromEnd(int n)
    {
        //calculate size if not present already
        if(n==size)
        {
            head = head.next;
            return;
        }
        int i=1;
        int iTofind = size -n;
        Node prev = head;
        while(i<iTofind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }


    //iterative search for a key in a linked list
    public int itrSearch(int key)
    {
        Node temp = head;
        int i= 0;

        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //recursive search for a key in linked list
       //-->helper function for recursive search
       public int helper(Node head, int key)
       {
        if(head==null)
        {
            return -1;
        }
        if(head.data==key)
        {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1)
            return -1;
        return idx+1;
       }

       //-->function for recursive search
       public int recSearch(int key)
       {
        return helper(head, key);
       }

    //printing linked list
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
        Linkedlist1 l1 = new Linkedlist1();
        l1.addfirst(5);
        l1.addfirst(4);
        l1.addfirst(3);
        l1.addfirst(2);
        l1.addfirst(1);
        l1.addlast(6);
        l1.addlast(7);
        l1.addlast(8);
        l1.addlast(9);
        l1.addlast(10);
        l1.addmiddle(6, 24);
        l1.print();
        System.out.println("Size of linked list is "+Linkedlist1.size);
        // int val = l1.removeFirst();
        // System.out.println("Removed node data from head is "+val);
        // l1.print();
        // System.out.println("Size of linked list is "+Linkedlist.size);

        // int val = l1.removeLast();
        // System.out.println("Removed node data from tail is "+val);
        // l1.print();

        // int key = 24;
        // System.out.println("Key "+key+" is at position "+l1.itrSearch(key)+" in the linked list");
        // System.out.println("Key "+key+" is at position "+l1.recSearch(key)+" in the linked list");

        l1.delNfromEnd(4);
        l1.print();


    }
}
