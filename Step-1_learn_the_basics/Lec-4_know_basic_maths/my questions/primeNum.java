// Date: 25.11.2026    

// Question: https://www.geeksforgeeks.org/problems/prime-number2314/1

class primeNum {
    public static void main(String[] args){
        int n = 7;
        System.out.print(isPrime(n));
    }
    static boolean isPrime(int n) {
        if(n == 1) return false;        // check
        
        for(int i=2; i*i<=n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
