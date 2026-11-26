// Date: 18.11.2026    

// Question: https://leetcode.com/problems/perfect-number/

class perfectNum_armstrong {
    public static void main(String[] args){
        int n = 28;
        System.out.print(checkPerfectNumber(n));
    }
    public static boolean checkPerfectNumber(int n) {
        int result = 0;
        for(int i=1; i*i <= n; i++){
            if(n%i == 0){
                result += i;
                int pairedNum = n / i;

                if(i != pairedNum) result += pairedNum;    // To check that our 2nd no. isn't equals to our 1st no. Therefore, to avoid duplicacy. Like if given n is 25. 
            }
        }
        result -= n;
        return result == n;
    }
}
// Before doing this ques, do "divisors.java" file's question of step-1, lec-4
// After doing this ques, do "sumOfDivisors".