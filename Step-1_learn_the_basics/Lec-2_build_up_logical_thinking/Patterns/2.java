// class Pattern2{
//     public static void main(String[] args){
//         int n=1;
//         for(int i=0; i<n; i++){          // row
//             for(int j=0; j<n; j++){      // column
//                 if(j==4) System.out.print("*");
//                 else System.out.print("* ");
//             }
//             if(n!=5) n += 1;          // check
//             System.out.println();
//         }
//     }
// }

class Pattern2{
    public static void main(String[] args){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}