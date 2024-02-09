/* PRINTING SUBARRAYS... */

public class Array7 {
    public static void print_Subarrays(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            //int start = i;
            for(int j = i; j < numbers.length; j++){
               // int end = j;
                for(int k = i; k <= j; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
           // System.out.println();
        }
    }

    public static void main(String args []){
      int numbers[] = {1,2,3,4,5};
      System.out.println("Subarrays are: ");
      print_Subarrays(numbers);
    }
    
}
