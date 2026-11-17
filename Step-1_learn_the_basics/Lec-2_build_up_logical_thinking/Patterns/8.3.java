class Pattern8_3{
    public static void main(String[] args){
        int n=5;
        for(int i=n; i>0; i--){   // Row
            // Space
            for(int j=0; j<2*(n-i); j++){             // Updated condition
                System.out.print(' ');
            }
            // Stars
            for(int j=0; j<2*i-1; j++){
                if(j == 2*i-1) System.out.print('*');  // For having space b/w stars
                System.out.print("* ");
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
        As done in pattern no. 8.3 (THIS code)
*/