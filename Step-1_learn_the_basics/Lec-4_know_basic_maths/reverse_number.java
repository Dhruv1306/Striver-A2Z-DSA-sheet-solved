// Date: 24.11.2026

// Question: https://leetcode.com/problems/reverse-integer/

// Need to remember the logic for Overflow

class reverse_number {               // 9:50 am
    public static void main(String[] args){
        int n = -123;
        System.out.println(reverse(n));
    }

    public static int reverse(int x) {
        int num = 0;
        while (x != 0) { // cause of -ve values, I can't put "x>0" cond.
            int digit = x % 10;
            x = x / 10;

            // NOTE: Before the next multiplication we need to check whether it'll cause overflow or not

            // check for positive overflow
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE && digit > Integer.MAX_VALUE % 10))
                return 0;

            // check for negative overflow
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE && digit < Integer.MIN_VALUE % 10))
                return 0;

            num = num * 10 + digit; // This line can cause OVERFLOW
        }
        return num;
    }
}                                         // 10:00 am
