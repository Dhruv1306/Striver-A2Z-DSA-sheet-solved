class Pattern7_1{
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<n; i++){        // rows
            
            // space
            for(int j=0; j<n-i-1; j++){
                System.out.print(' ');
            }

            // Stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            System.out.println();       // next line
        }
    }
}

/* Formula for printing in the row:
    - If we check carefully, we are printing "space, starts, space". Also, we don't need to print the spaces after the stars. 
    - For space, we can say,"n-i-1", where n is 5.


NOTE: We are gonna print the full row at once. We aren't printing for each column.

NOTE: See, we don't have ant space b/w the stars. So, 1 star = 1 character.
        Therefore, we need "n-i-1" space.

      But, if we have space b/w the stars. Than, 1 star = 2 characters (star + space).
        Therefore, in this case, we need "2*(n-i-1)" space.
        As done in pattern no. 7.2
*/