/* Find permutations of given string */

public class B_T3 {
    public static void findPermutation(String str, String ans)
    {
        //base case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++)
        {
            char curr = str.charAt(i);
            String new_str = str.substring(0, i)+str.substring(i+1);
            findPermutation(new_str, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Permutations of string "+str+" are :");
        findPermutation(str, "");
        
    }
}
