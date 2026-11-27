// Date: 26.11.2026    

// Question: https://takeuforward.org/practice/dsa/count-all-digits-of-a-number

class factorial {
    public static void main(String[] args){
        int n = 3;
        System.out.print(f(n));
    }
    public static int f(int n) {
        if(n == 0) return 1;     // base Condition
        return n * f(n-1);
    }
}
// 3! -> 3*2*1