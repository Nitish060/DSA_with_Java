/* Implementation of Circular Queue */

import java.util.*;

public class Queue2{
    static class Queue
    {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }

        public boolean isFull()
        {
            return (rear+1)%size==front;
        }

        //function for adding element 
        public void add(int data)
        {
            //add first element
            if(front==-1)
                front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //function for removing element
        public int remove()
        {
            if(isEmpty())
                return -1;
            int result = arr[front];
            //last element delete
            if(rear==front)
                rear = front-1;
            else
                front = (front+1)%size;
            return result;
        }

        //function for peek
        public int peek()
        {
            if(isEmpty())
                return -1;
            return arr[front];
        }

        //Display elements of Queue
        public void display()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return;
            }
            for(int i=front; i<=rear; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int choice,n;
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Queue");
        n = sc.nextInt();
        Queue q = new Queue(n);
        while ((status)) {
            System.out.println("1. Add element in the Queue");
            System.out.println("2. Delete element from the Queue");
            System.out.println("3. Peek element of Queue");
            System.out.println("4. Display elements of Queue");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:   if(q.isFull())
                         {
                            System.out.println("Queue is Full");
                            break;
                         }
                          System.out.println("Enter the data");
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