class Pattern8_1{
    public static void main(String[] args){
        for(int i=5; i>0; i--){
            for(int j=i+i-1; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* Formula for printing in the row:
    - See, let say for row 5th, we are printing 9 stars & for row 3rd, we are printing 5 stars.
    - Means, for any row, we are printing, "row no. + row no. - 1" stars.  
*/