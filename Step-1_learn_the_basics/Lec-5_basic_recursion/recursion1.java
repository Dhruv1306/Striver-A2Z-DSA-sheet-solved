// Date: 26.11.2026    

// Question: https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1

class recursion1 {
    public static void main(String[] args){
        int n = 5;
        print(n);
    }
    public static void print(int n) {
        if(n == 0) return;
        print(n-1);
        System.out.print(n + " ");
    }
}

// Recursion: A function calling itself with updated parameters till it reaches a base condition. 

// After reaching the base case, the function prints the number and then "returns" from each call, printing numbers in increasing order as it unwinds.
// So, it's like, solving in Descending order & printing in Ascending / Descending order.

// Also in recursion you don't use for, while or do-while loop.