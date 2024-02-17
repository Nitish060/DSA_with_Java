/* Queue using Linledlist */

import java.util.Scanner;

public class Queue3 {
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static class Queue
    {
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty()
        {
            return head==null && tail==null;
        }

        //function for adding element
        public void add(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //function for removing element
        public int remove()
        {
            if(isEmpty())
            {
                return -1;
            }
            int front = head.data;
            //single element
            if(tail==head)
            {
                tail = head = null;
            }
            else
            {
                head = head.next;
            }
            return front;
        }

        //function for peek
        public int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }

        //function for display
        public void display()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        int choice;
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        while ((status)) {
            System.out.println("1. Add element in the Queue");
            System.out.println("2. Delete element from the Queue");
            System.out.println("3. Peek element of Queue");
            System.out.println("4. Display elements of Queue");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:   System.out.println("Enter the data");
                          int data = sc.nextInt();
                          q.add(data);
                          break;

                case 2:   int r = q.remove();
                          if(r==-1)
                          {
                            System.out.println("Queue is Empty");
                            break;
                          }
                          System.out.println("Deleted element from queue is "+ r);
                          break;

                case 3:  int f = q.peek();
                         if(f==-1)
                         {
                            System.out.println("Queue is Empty");
                            break;
                         }
                         System.out.println("Front element of queue is "+ f);
                         break;
                
                case 4:   System.out.println("Element of Queue are");
                          q.display();
                          break;

                case 5:   status = false;
                          break;

                default:  System.out.println("Enter valid choice");
                          break;
            }
        }
        sc.close();
    }
}
