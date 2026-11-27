// Date: 28.09.2026    

// Question: https://leetcode.com/problems/fibonacci-number/

// This ques is really good to understand & practice DP.
// We are going to solve this using 4 different approaches,i.e, Recursion approach, DP Memoization approach , DP Tabulation approach and Space Optimization

class fibonacci {
    public static void main(String[] args){
        int n = 10;
        System.out.print(fib(n));
    }
    
    // Recursion Approach                 // TC : (2^n)   SC : O(n)
    public static int fib(int n){
        // Base cond.
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }


// Note: The reason the time is exponential is because we're calculating the same Fibonacci values repeatedly.
// And is a very good example to understand why DP is needed.


    // DP  Memoization approach      (Top-Down approach)              // TC : O(n)     SC : O(n)
    /*public int fib(int n) {
        // 1. Create storage / dp
        int[] dp = new int[n+1];   // This will act as our storage for the results we have calculated
                                  // Example: dp[5] == fib(5) ,i.e, dp[i] stores fib(i)
                                 // We need indexes from 0 to n, therefore, we need n + 1 spaces.
                                // NOTE: In JAVA, "array size" and "array index" are different things. Ok
                               // Let's say if take "n = 5" and In our code, if we take the size of dp As "new int[n]". Then, it means that we have an array Of size "5" BUT of indexes "from 0 to 4". And, in our code, we have "dp[n]" Which means "dp[5]". But we don't have 5th index, and then we'll get "Array index out of bound exception". 
                            // NOTE: If we have to access dp[n]. We'll take,"new int[n + 1]" ,i.e, dp[0] -> dp[n]
                           //   BUT, if we only needed till dp[n-1]. we'll do,"new int[n]" ,i.e, dp[0] -> dp[n-1]
                          // NOTE: "new int[n + 1]"  IS VERY COMMON IN DP.

        // 2. Fill this storage with "-1" value initially. 
        // So that, later we can check whether this specific index's value has been checked/stored or not.
        Arrays.fill(dp, -1);

        // 3. Start calculating.
        return solve(n, dp);       // our dp/storage is passed along so that we can remember previous answers. or you can say for maintaining data persistency, like docker volumes.
    }

    public int solve(int n, int[] dp){
        if(n == 0) return 0;        // Base cases
        if(n == 1) return 1;

        // 1. Now, firstly check if we had already calculated the result for fib(n).
        // If yes, than we'll return the stored answer instead of calculating again.
        if(dp[n] != -1) return dp[n];                     // This is the MEMOIZATION part.

        // 2. If not, than we can calculate the fib(n)
        // fib(n)  =  fib(n - 1) + fib(n - 2)              // formula
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);

        // 3. Return the updated dp/storage
        return dp[n];
    }
    */


    // DP  Tabulation approach   (Bottom Up approach)         // TC : O(n)   SC : O(n)
    /*public static int fib(int n) {
        if(n <= 1) return n;         // Base case

        // 1. Our storage/dp 
        int[] dp = new int[n + 1];            // We need indexes "0 through n", so we need n + 1 positions.
        
        // 2. Put basic values   (*This step is acc. to the ques requirement*)
        dp[0] = 0;
        dp[1] = 1;

        // 3. Now, we'll build Fibonacci values from 2 up to n.
        for(int i=2; i<=n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];       // contains our final answer
    }
    */


    // Space Optimization, a little bit like tabulation         // TC : O(n)   BUT, SC : O(1)
    /*public int fib(int n){
        if(n <= 1) return n;     // Base Case

        int prev1 = 1;        // fib(n-1)
        int prev2 = 0;       // fib(n-2)

        for(int i=2; i<=n; i++){
            int current = prev1 + prev2;           // Current Fibonacci number

            // Now, as we move forward, our old "prev1" becomes the new "prev2" & "current" becomes "prev1".
            prev2 = prev1;
            prev1 = current; // So, here, in our "prev1", we have the latest fibonacci no., until the next iteration.
        }
        return prev1;
    }
    */
}

/* NOTE : This "Space Optimization" approach is only possible through "Tabulation" method only ,i.e, Bottom-Up approach.
- In Tabulation / Memoization, we're storing our result. Thus, our SC : O(n).
- BUT we realized that we only need the last two values. 
- So, we're using only 2 variables dynamically to store our last 2 value's result.
- Thus, now our SC : O(1).
*/


/* NOTE: The fundamental DP thought process OR When you see a recursive problem:

1. Write the recurrence relation you came up with
2. Notice repeated calculations, if any.
3. Storing those results  ->  Go with Memoization approach
4. Wanna Remove recursion  ->  Go with Tabulation approach
5. Ask yourself: "Do I really need the entire DP array?" OR, If I only need the previous few states, OPTIMIZE THE SPACE.
*/

// Started this question on 28.09.2026 at around 4:30 pm, completed it ( with full understanding ) at 8:15 pm.