// Date: 26.11.2026    

// Question: https://www.geeksforgeeks.org/problems/print-gfg-n-times/1

class recursion2 {
    public static void main(String[] args){
        int n = 5;
        print(n);
    }
    public static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.print("GFG ");
    }
}
