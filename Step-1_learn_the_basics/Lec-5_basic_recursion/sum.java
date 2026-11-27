// Date: 26.11.2026    

// Question 1: https://www.geeksforgeeks.org/problems/reverse-coding2452/1
// Question 2: https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class sum {
    public static void main(String[] args){
        int n = 6;
        System.out.print(s(n));
    }
    // public static int s(int n){           // Ques.1
    //     if(n == 0) return 0;
    //     return n + s(n-1);
    // }

    public static int s(int n){             // Ques.2
        if(n == 0) return 0;
        return (int)Math.pow(n,3) + s(n-1);    // cause Math returns "double" type of value
    }
}
