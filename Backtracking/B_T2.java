/* ------------- Finding and printing all subsets of a string ------------ */

public class B_T2 {
    public static void findSubsets(String str, String ans, int i)
    {
        //base case
        if(i==str.length())
        {
            if(ans.length()==0)
            {
                System.out.println("NULL");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Subsets of "+str+ " are:");
        findSubsets(str, "", 0);
    }
}
