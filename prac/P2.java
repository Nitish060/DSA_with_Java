import java.util.*;
public class P2 {
    public static void main(String[] args) {
        int[][] s1 = {{6,9},{3,5},{8,4},{1,2}};
        Arrays.sort(s1, Comparator.comparingInt(s->s[1]));
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s1[0].length;j++)
            {
                System.out.print(s1[i][j]+" ");
            }
        }

    }
}
