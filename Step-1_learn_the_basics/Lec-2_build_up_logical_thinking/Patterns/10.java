class Pattern10{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){            // Part_1: Upper Pyramid
            // Stars
            for(int j=0; j<i; j++) System.out.print("*");

            System.out.println();   // next line
        }

        for(int i=n; i>1; i--){       // Part_2: Down Pyramid
            // Stars
            for(int j=0; j<i-1; j++) System.out.print("*");

            System.out.println();    // next line
        }
    }
}