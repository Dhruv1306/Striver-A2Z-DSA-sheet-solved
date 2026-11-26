// Date: 26.11.2026    

// Question: https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class minimumJumps {                          // 1:09 pm
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 1, 4};
        // int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        // int[] arr = {0, 10, 20};
        System.out.print(minJumps(arr));
    }
    public static int minJumps(int[] arr) {
        int length = arr.length;
        if(length <= 1) return 0;        // check
        if(arr[0] == 0) return -1;      // check
        
        int jumps = 0;
        int currentJumpsEnd = 0;      // the end boundary of the current jump.
        int farthest = 0;            // the furthest index reachable so far among indices seen in the current jump window.
        
        for(int i=0; i<length-1; i++){        // "length-1" is taken to avoid "ArrayIndexOutOfBound" error while calculating farthest
            farthest = Math.max(farthest, i+arr[i]);
            
            // If we've reached the end of the current jump range
            if(i == currentJumpsEnd){
                jumps++;
                currentJumpsEnd = farthest;
                
                // If even the farthest reach can't move forward, we're stuck. For ex, if index value is 0, then, farthest will be the same & then the currentJumpsEnd will also remain at the same index, making us stuck...
                if(currentJumpsEnd <= i) return -1;
            }
            
            // Already able to reach or pass the last index
            if(currentJumpsEnd >= length-1) return jumps;
        }
        return -1;
    }
}                                            // 1:50 pm      Taken Help!!!
// TC: O(n)    SC: O(1)