// Date: 25.11.2026    

// Question: https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1

class armstrong {
    public static void main(String[] args){
        int num = 153;
        System.out.println(armstrongNumber(num));
    }
    static boolean armstrongNumber(int n) {
        int length = String.valueOf(n).length();
        int original = n;
        int result = 0;

        while(n > 0){
            int digit = n % 10;
            n /= 10;
            result += (int) Math.pow(digit, length);
        }
        return result == original;
    }
}

// Math.pow(index,exponent) & it returns a double type of result like 8.0, 10.0
/*
    TC: O(log n)
    SC: O(log n), because String.valueOf(n) allocates a temporary string whose length equals the number of digits in n.
    
    Note: If we count the digits with a while loop instead of converting to a String, the auxiliary space drops to O(1).
*/