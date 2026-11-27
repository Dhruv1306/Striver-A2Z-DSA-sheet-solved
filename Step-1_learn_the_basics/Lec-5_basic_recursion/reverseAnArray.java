// Date: 27.11.2026    

// Question: https://leetcode.com/problems/reverse-string/

class reverseAnArray {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    // 2-pointer approach           // TC : O(n)     SC : O(1)
    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length-1;
        
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;            // This is called "in-place" modification

            left++;
            right--;
        }
        System.out.print(s);
    }
}
