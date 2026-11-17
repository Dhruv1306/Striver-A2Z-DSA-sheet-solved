// Date: 14.09.2026

class Patterns11To22{
    static int n=5;              // cause without static keyword, it's a non-static variable & we cannot reference a non-static variable to a static fn.

    public static void pattern_11_1(){       // Started at 1:00 pm
        int n=6;   
        int first_digit = 0;
        int sec_digit = 1;       
        for(int i=1; i<n; i++){            // we have taken 1-based indexing
            if(i%2 == 0){                 // For even rows
                for(int j=1; j<=i; j++){
                    System.out.print(first_digit);
                }
            } else {                       // For Odd rows
                for(int j=1; j<=i; j++){
                    System.out.print(sec_digit);
                }
            }
            System.out.println();
        }
        System.out.println();        // To give a line for next fn. result. 
    }                                       // finished at 1:24 pm


    public static void pattern_11_2(){       // Started at 1:40 pm
        int n=6;   
        int start;     
        for(int i=1; i<n; i++){            // we have taken 1-based indexing
            if(i%2 == 0) start = 0;       // For even rows
            else start = 1;                 // For Odd rows

            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1 - start;             // logic execution
            }
            System.out.println();
        }
        System.out.println();        // To give a line for next fn. result. 
    }                                       // finished at 2:04 pm  (Taken Help)


    static void pattern_12(){              // started at 2:07 pm
        int n=5;

        // Note: we need to figure out a formula for the starting value of spaces & then we can decrease it by 2 on every row iteration.
        
        int space = 2*(n-1);             // This is the starting value for spaces

        for(int i=1; i<=n; i++){
            // Numbers
            for(int j=1; j<=i; j++) System.out.print(j);

            // Spaces
            for(int j=1; j<=space; j++) System.out.print(' ');

            // Numbers
            for(int j=i; j>0; j--) System.out.print(j);        // For mirror printing

            space -= 2;         // to gradually decrease the space by 2.
            System.out.println();           // For next row
        }
        System.out.println();
    }                                     // Finished at 2:51 pm  (Taken Help)


    public static void pattern_13(){        // Started at 2:52 pm
        int count=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(count + " ");     // either, print this single line 

                // System.out.print(count);       // or, print these 2 lines. 
                // System.out.print(' ');
                count++;
            }
            System.out.println();          // For next row
        }
        System.out.println();        
    }                                      // Finished at 3:00 pm  


    public static void pattern_14(){        // Started at 3:04 pm
        // for(int i=0; i<n; i++){        // Method-1
        //     for(char ch='A'; ch<='A'+i; ch++) System.out.print(ch + " ");
        //     System.out.println();          // For next row
        // }
        // System.out.println();

        // NOTE: We should use => (ch + " ") instead of (ch + ' ').
        //       Because ' ' is a char, and (char + char) performs integer addition in Java.

        char c = 'A';             // Method-2

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print((char)(c + j) + " ");
            }
            System.out.println();
        }
    }                                      // Finished at 3:20 pm  (Taken Help) 


    public static void pattern_15(){       // Started at 3:24 pm
        for(int i=n; i>0; i--){
            for(char ch='A'; ch<'A'+i; ch++) System.out.print(ch + " ");
            System.out.println();     // For next row;
        }

        System.out.println();
    }                                     // Finished at 3:26 pm


    public static void pattern_16(){       // Started at 3:27 pm
        for(int i=0; i<n; i++){
            char ch = (char) ('A' + i);    // Now, if i=0 -> 'A',  if i=1 -> 'B',  & so on...
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();      // For next row;
        }
        System.out.println();
    }                                     // Finished at 3:42 pm


    public static void pattern_17(){        // Started at 3:43 pm
        for(int i=0; i<n; i++){
            // Space
            for(int j=1; j<=n-i-1; j++){
                System.out.print("-");
            }
            // Alphabet
            char ch='A';
            int breakPoint = (2*i+1) / 2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<=breakPoint) ch++;
                else ch--;
            }
            System.out.println();         // For next row;
        }
        System.out.println();
    }                                      // Finished at 4:10 pm  (Taken Help)


// Date: 15.09.2026

    public static void pattern_18(){       // Started at 10:15 am

        for(int i=1; i<=n; i++){
            char ch = (char)('A' + n-i);  // Calculate the starting character at the beginning of each row
            for(int j=0; j<i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
    }                                     // Finished at 11:10 am  (Taken Help)


    public static void pattern_19(){       // Started at 1:10 pm

        for(int i=n; i>0; i--){          // Phase_1: Upper Pyramid               
            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            //space
            for(int j=0; j<2*(n-i); j++) System.out.print("-");

            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            System.out.println();   // For next Row
        }

        for(int i=1; i<=n; i++){           // Phase_2: Lower Pyramid           
            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            //space
            for(int j=0; j<2*(n-i); j++) System.out.print("-");

            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            System.out.println();   // For next Row
        }
        System.out.println();
    }                                     // Finished at 1:45 pm


    public static void pattern_20(){       // Started at 1:50 pm
        for(int i=1; i<=n; i++){     // Phase_1: Upper Pyramid
            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            //space
            for(int j=0; j<2*(n-i); j++) System.out.print("-");

            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            System.out.println();    // For next row
        }

        for(int i=n-1; i>0; i--){      // Phase_2: Lower Pyramid
            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            //space
            for(int j=0; j<2*(n-i); j++) System.out.print("-");

            //stars
            for(int j=0; j<i; j++) System.out.print("*");

            System.out.println();    // For next Row
        }
        System.out.println();
    }                                     // Finished at 2:10 pm    


    public static void pattern_21(){        // Started at 2:12 pm
        int n=2;
        for(int i=0; i<n; i++){        // Part_1: Upper deck
            // Stars
            for(int j=0; j < (2*n - 2*i) / 2; j++) System.out.print("*");

            // Space
            for(int j=0; j<2*i; j++) System.out.print("-");

            // Stars
            for(int j=0; j < (2*n - 2*i) / 2; j++) System.out.print("*");

            System.out.println();      // For next Row
        }

        for(int i=n-1; i>=0; i--){        // Part_2: Lower deck
            // Stars
            for(int j=0; j < (2*n - 2*i) / 2; j++) System.out.print("*");

            // Space
            for(int j=0; j<2*i; j++) System.out.print("-");

            // Stars
            for(int j=0; j < (2*n - 2*i) / 2; j++) System.out.print("*");

            System.out.println();      // For next Row
        }
        System.out.println();
    }                                      // Finished at 2:20 pm


    public static void pattern_22(){       // Started at 2:21 pm
        int n=4;
        
        for(int i=0; i<2*n-1; i++){     // Both rows & col loops run same times
            for(int j=0; j<2*n-1; j++){ // And these loops run from 0 to 6.
                int top = i;
                int bottom = (2*n-2) - i;
                int left = j;
                int right = (2*n-2) - j;
                int min = Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print(n - min);
            }
            System.out.println();
        }
        System.out.println();
    }                                     // Finished at 4:06 pm    (Taken Help!!!!!)

    public static void main(String[] args){
        // pattern_11_1();
        // pattern_11_2();
        // pattern_12();
        // pattern_13();
        // pattern_14();
        // pattern_15();
        // pattern_16();
        // pattern_17();
        // pattern_18();
        // pattern_19();
        // pattern_20();
        // pattern_21();
        // pattern_22();
    }
}

// NOTE: In one line, use double quotes (" ") for space b/w the elements.  (pattern_14)

/* NOTE: JAVA does UNICODE Calculation.              (pattern_18)
         i.e. ASCII value of 'A' is 65.
         i.e. when we are doing, ('A' + 0)  =>  65+0 -> 65 = 'A'
         And, when we are doing, ('A' + 1)  =>  65+1 -> 66 = 'B'
*/

/* NOTE: Method-1  =>  The Matrix way approach...       (pattern_22)
         
         In this, we need to take n's value and figure out the rows / columns according to that.

         We know that the first number is 4 & what the output matrix looks like. So, why not we subtract this 4 from that output matrix & get a new matrix and now if we find the minimum distance  b/w top, down, left & right sides from that index & then subtracting that min distance from our n, we'll get our value.  


        Method-2  =>  Figuring out the nearest edge approach... 

        In this, we need to take the no. of rows / columns and figure out the first number's value according to that.

        So, for every position (i, j), we need to figure out how far that position is from the nearest edge, from both sides.
        Similarly, like the left, right, top & bottom distance in Method-1. 
*/