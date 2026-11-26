// Date: 24.11.2026    

// Question: https://leetcode.com/problems/palindrome-number/description/


class check_palindrome {
    public static void main(String[] args){
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;                 // check implemented before starting to code
        if(x == 0) return true;                // check implemented b/w coding

        int original = x;      // Either don't manipulate the given variables or store them before proceeding 
        int num = 0;;
        while(x > 0){
            int digit = x % 10;
            x /= 10;
            num = num * 10 + digit;
        }
        return num == original;
    }
}                                            // 10:21 am

// TC: O(log n)
// Cause in each iteration, we are decreasing the number by 1 digit.  ( x /= 10 )