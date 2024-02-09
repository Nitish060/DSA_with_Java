public class Recursion13 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Number of binary string of size "+n+" is");
        print_binaryString(n, 0, "");
    }

    public static void print_binaryString(int n, int last_place, String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        if(last_place==0)
        {
       print_binaryString(n-1, 0, str+("0"));
       print_binaryString(n-1, 1, str+("1"));
        }

        else
        {
            print_binaryString(n-1, 0, str+("0"));
        }
    }

}
