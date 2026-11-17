class Pattern8_2{
    public static void main(String[] args){
        int n=5;
        for(int i=n; i>0; i--){   // Row
            // Space
            for(int j=0; j<n-i; j++){
                System.out.print(' ');
            }
            // Stars
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();   // next line
        }
    }
}

/* Formula for printing in the row:
    - If we check carefully, we are printing "space, starts". We don't need to consider the spaces after the stars. 
    - For space, we can say,"n-i-1", where n is 5.

NOTE: We are gonna print the full row at once. We aren't printing for each column.

NOTE: See, we don't have ant space b/w the stars. So, 1 star = 1 character.
        Therefore, we need "n-i" space.

      But, if we have space b/w the stars. Than, 1 star = 2 characters (star + space).
        Therefore, in this case, we need "2*(n-i)" space.
        As done in pattern no. 8.3 
*/

// class Pattern8_2{
//     public static void main(String[] args){
//         int n = 5;
//         int t = n;
//         for(int i=1; i<=n; i++){
//             //space
//             for(int j=0; j<i-1 ;j++) System.out.print("-");

//             //stars
//             for(int j=0; j<2*t-1 ; j++) System.out.print("*");

//             t--;
//             System.out.println();
//         }
//     }
// }