class Pattern3{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){          // row
            for(int j=1; j<=i; j++){      // column
                if(j==5) System.out.print(j);
                else System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}