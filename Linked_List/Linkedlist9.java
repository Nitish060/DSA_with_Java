public class Linkedlist9 {
    public class Node //Doubly Linkedlist Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add node at first
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //remove node at last
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("Doubly linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val = head.data;
            head = tail= null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //add node at last
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(tail==null)
        {
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //remove node at last
    public int removeLast()
    {
        if(tail==null)
        {
            System.out.println("Doubly linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1)
        {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void reverse()
    {
        Node curr = head;
        Node pre = null;
        Node nxt;

        while(curr!=null)
        {
            nxt = curr.next;
            curr.next = pre;
            curr.prev = nxt;
            pre = curr;
            curr = nxt;
        }
        head = pre;
    }

    //print method for nodes of doubly linkedlist
    public void print()
    {
        if(head==null)
            System.out.println("Linked list is empty");
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist9 l1 = new Linkedlist9();

        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();

        l1.addLast(6);
        l1.addLast(7);
        l1.addLast(8);
        l1.addLast(9);
        l1.addLast(10);
        l1.print();

        int i = l1.removeFirst();
        int j = l1.removeFirst();
        System.out.println("Removed data from first are "+i+" "+j);
        l1.print();

        int k = l1.removeLast();
        int l = l1.removeLast();
        System.out.println("Removed data from last are "+k+" "+l);
        l1.print();

        l1.reverse();
        System.out.println("Doubly Linkedlist after reversal");
        l1.print();
    }
}
