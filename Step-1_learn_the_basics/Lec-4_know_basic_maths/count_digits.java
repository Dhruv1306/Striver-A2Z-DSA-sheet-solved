// Date: 18.11.2026    

// Question: https://takeuforward.org/practice/dsa/count-all-digits-of-a-number

class count_digits {             // 2:58 pm
    public static void main(String[] args){
        int n = 1203400;
        System.out.print(countDigit(n));
    }

    public static int countDigit(int n){
        if(n == 0) return 0;             // edge case
        int count = 0;
        while(n > 0){
            int digit = n%10;
            if(digit > 0 || count > 0) count++;      // added condition. (It doesn't have to do anything with the question. Simply writing "count++" at this line will also work.)
            n /= 10;
        }
        return count;
    }
}                              // 3:06 pm