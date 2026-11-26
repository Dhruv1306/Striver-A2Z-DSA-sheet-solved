// Date: 25.11.2026    

// Question: https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

class LCM_GCD {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int[] arr = new int[2];
        arr = lcmAndGcd(a,b);
        System.out.println("LCM: " + arr[0]);
        System.out.println("GCD: " + arr[1]);
    }
    public static int[] lcmAndGcd(int a, int b) {
        
        int x = a;
        int y = b;
        
        //GCD
        while(y != 0){                  // TC: O(log(min(a, b)))
            int temp = y;
            y = x % y;
            x = temp;
        }                    // Now, x contains the GCD.
        
        //LCM
        int lcm = (a * b) / x;
        
        return new int[]{lcm,x};
    }
}
/**
     * Using Optimized Euclidean’s Algorithm
     * 
     * Time Complexity: O(log(min(a, b)))
     *  - The Euclidean algorithm is efficient and runs in logarithmic time relative to the smaller of the two numbers.
     * Space Complexity: O(1)
     *  - The function uses a constant amount of space regardless of the input size.
*/