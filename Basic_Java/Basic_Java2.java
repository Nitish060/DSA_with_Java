import java.util.*;
public class Basic_Java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String S = sc.next();
        char k = sc.next().charAt(0);
        int c = 0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)== k){
                c = c+1;
            }
        }
        
        System.out.println(c);
        
    }
}
