class Pattern9{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){             // Part_1: Upper Pyramid
            // Spaces
            for(int j=0; j<n-i; j++) System.out.print(' ');

            // Stars
            for(int j=0; j<2*i-1; j++) System.out.print("*");

            System.out.println();   // next line
        }

        for(int i=n; i>0; i--){             // Part_2: Down Pyramid
            // Spaces
            for(int j=0; j<n-i; j++) System.out.print(' ');

            // Stars
            for(int j=0; j<2*i-1; j++) System.out.print("*");

            System.out.println();     // next line
        }
    }
}

// NOTE: Formula for space & stars remains the same. 
//       If we're going in Ascending order structure, then the for loop for row, will also work in Ascending order,i.e, from 1 to n.
//       If we're going in Descending order structure, then the for loop for row, will also work in Descending order,i.e, from n to 0.