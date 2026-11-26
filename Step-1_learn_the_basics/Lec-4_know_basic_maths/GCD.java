// Date: 24.11.2026    

// Question: https://leetcode.com/problems/find-greatest-common-divisor-of-array/

import java.util.Arrays;

class GCD {
    public static void main(String[] args){
        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        // Sort
        Arrays.sort(nums);                           // O(n log n)

        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        return gcd(smallest, largest);         // Also, it doesn't matter if you pass (smallest,largest) or (largest,smallest).
    }

    public static int gcd(int a, int b){         // Euclidean Algorithm : O(log(min(a, b)))
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Therefore the overall TC : O(n log n)

/* We Can optimize it more.
    Instead of using sort method, We can take two variables min and max and we use a for loop to traverse the given array And updating the Minimum and maximum value. Traversing an array only takes O(n).
 */

    // public int findGCD(int[] nums) {     // Using traversing takes O(n) better than using "sort()" method.
    //     int min = Integer.MAX_VALUE;
    //     int max = Integer.MIN_VALUE;
    //     for(int n : nums){
    //         if(n < min) min = n;
    //         if(n > max) max = n;
    //     }
    //     return gcd(min, max);
    // }