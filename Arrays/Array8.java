/* MAXIMUM SUM OF SUB_ARRAY */

public class Array8 {
    public static void sum_Subarrays(int numbers[]){
        int curr_sum = 0; 
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                curr_sum = 0;
                for(int k = start; k <= end; k++){
                    System.out.println(numbers[k]+" ");
                    curr_sum += numbers[k];
                }
                System.out.println("Sum of current sub_array is "+ curr_sum);
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
                //System.out.println();
            }
        }
        System.out.println();
        System.out.println("Maximum sum of sub_array is " + max_sum);
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        sum_Subarrays(numbers);
    }
}
