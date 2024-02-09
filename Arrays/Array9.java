public class Array9 {
    public static void maxSubarray_sum(int numbers[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i <  numbers.length; i++){
            int start = i;
            for(int j = 0; j < prefix.length; j++){
                int end = j;
                curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(max_sum < curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("Maximum sub_array sum is " + max_sum);
    }

    public static void main(String args []){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray_sum(numbers);
    }
}
