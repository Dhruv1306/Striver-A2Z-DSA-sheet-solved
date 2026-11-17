class Pattern1{
    public static void main(String[] args){
        for(int i=0; i<5; i++){          // row
            for(int j=0; j<5; j++){      // column
                if(j==4) System.out.print("*");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}