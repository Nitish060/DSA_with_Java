public class Array10 {
    public static void  Kadanes(int numbers[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            curr_sum = curr_sum + numbers[i];
            if(curr_sum<0){
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum, max_sum);
        }
        System.out.println("Maximum sub_array sum is " + max_sum);
    }
    public static void main(String args []){
        int numbers[] = {1,-2, 6,-1, 3};
        Kadanes(numbers);
    }
}
