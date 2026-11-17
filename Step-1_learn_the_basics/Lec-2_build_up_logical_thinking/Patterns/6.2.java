class Pattern6_2{
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<5; i++){
            int x=1;
            for(int j=n; j>0; j--){
                if(j==1) System.out.print(x);
                else System.out.print(x + " ");
                x++;
            }
            if(n!=1) n -= 1;
            System.out.println();
        }
    }
}