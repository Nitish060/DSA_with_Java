/* Implementation using Java Collection Framework */
import java.util.*;

public class Stack3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
