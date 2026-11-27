// Date: 26.11.2026    

// Question: https://leetcode.com/problems/valid-palindrome/description/

// Note: We're not comparing character by character. We are comparing character's ASCII value with each other.

class palindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";    // true
        // String s = "race a car";                    // false
        System.out.print(isPalindrome(s));
    }

    // Approach-1  (using while loop)
    /*public static boolean isPalindrome(String s){
        s = s.toLowerCase();            // String is immutable
                                        // But the variable pointing to that string isn't. We can always assign a new value to that variable. 
                                        // As in this case, we are making "s" to point to a new String. 
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            // Skip non-alphanumeric characters from left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            // Skip non-alphanumeric characters from right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    */

    // Approach-2  (using for loop)
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        for(int i=0, j=s.length() - 1; i<j; ){      // here, our 2 variables are i & j
            // Skip non-alphanumeric characters from left
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;       // "continue" skips the further code and return to the loop for the next iteration
            }

            // Skip non-alphanumeric characters from right
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) return false;   // check
            i++;
            j--;
        }
        return true;
    }
}
