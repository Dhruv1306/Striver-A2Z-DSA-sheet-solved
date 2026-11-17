class Pattern6_1{
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<5; i++){
            for(int j=n; j>0; j--){
                if(j==1) System.out.print(j);
                else System.out.print(j + " ");
            }
            if(n!=1) n -= 1;
            System.out.println();
        }
    }
}