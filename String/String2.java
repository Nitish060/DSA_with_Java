/* Print Letters at particular iteration */

public class String2 {
    public static void print_letters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        String full_name = "Nitish" + "Mishra";
        print_letters(full_name);
    }
}
