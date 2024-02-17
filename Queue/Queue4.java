/* Implementation of Queue using Java Collection Framework */

import java.util.*;

public class Queue4 {
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();

       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);

       while(!q.isEmpty())
       {
        System.out.print(q.peek()+" ");
        q.remove();
       }
    }
}
/* Queue is an Interface in JCF and we cannot make objects of an Interface. Therefore we create objects
 of classes that implements Queue which are LinkedList and ArrayDeque
 */