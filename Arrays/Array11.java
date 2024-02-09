/* TRAPPED RAINWATER PROGRAM */

public class Array11 {
    public static int trapped_Rainwater(int height[]) {
        int n = height.length;
        // Calculate left max boundary array
        int left_max[] = new int[height.length];
        left_max[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        // Calculate right max boundary array
        int right_max[] = new int[height.length];
        right_max[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
             right_max[i] = Math.max(height[i],  right_max[i + 1]);
        }

        int trapped_water = 0;

        for (int i = 0; i < n; i++) {
            // water level = min(left_max, right_max) - height
            int water_level = Math.min(left_max[i], right_max[i]);

            trapped_water += water_level - height[i];
        }
        return trapped_water;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped rainwater will be " + trapped_Rainwater(height) + " units");
    }
}
