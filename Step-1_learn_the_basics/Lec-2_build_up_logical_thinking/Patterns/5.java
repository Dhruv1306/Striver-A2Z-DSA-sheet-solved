class Pattern5{
    public static void main(String[] args){
        int n=5;
        int t = n;
        for(int i=0; i<n; i++){
            for(int j=t; j>0; j--){
                if(j==1) System.out.print("*");
                else System.out.print("* ");
            }
            if(t!=1) t--;
            System.out.println();
        }
    }
}