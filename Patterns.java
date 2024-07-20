public class Patterns {
  public static void main(String[] args) {
    int n =4;
    int m = 5;


    // * * * * *
    // *       *
    // *       *
    // * * * * *
    // for (int i = 1; i <= n; i++) {
    //   for(int j=1; j<=m;j++){
    //     if(i == 1 || j == 1 || i ==n || j==m){
    //       System.out.print(" *");
    //     }else{
    //       System.out.print("  ");
    //     }
    //   }
    //   System.out.println();   
    // }


// *
// **
// ***
// ****
    // for(int i = 1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }



    // ****
    // ***
    // **
    // *
    // for(int i = n; i>=1; i--){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    //     *
    //    **
    //   ***
    //  ****
    // for(int i = 1; i<=n; i++){
    //     for(int k = n-i; k>=0; k--){
    //       System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++){
    //       System.out.print("*");
    //     }
    //     System.out.println();
    //   }


      // 1
      // 12
      // 123
      // 1234
      // for(int i = 1; i<=n; i++){
      //     for(int j=1; j<=i; j++){
      //       System.out.print(j);
      //     }
      //     System.out.println();
      //   }


      // 12345
      // 1234
      // 123
      // 12
      // 1
      // n=5;
      //   for(int i = n; i>=1; i--){
      //     for(int j=1; j<=i; j++){
      //       System.out.print(j);
      //     }
      //     System.out.println();
      //   }



        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // n=5;
        // int k=1;
        // for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //     System.out.print(k+" ");
        //     k++;
        //   }
        //   System.out.println();
        // }



        // 1
        // 01
        // 101
        // 0101
        // 10101
        // n=5;
        // int k=1;
        // for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //     if((i+j)%2==0){
        //       System.out.print("1 ");
        //     }else{
        //       System.out.print("0 ");
        //     }
            
        //   }
        //   System.out.println();
        // }



        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // n=5;
        // int k=1;
        // for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //   }
        //   for(k=1;k<=2*(n-i);k++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // //loerhalf
        // for(int i = n; i>=1; i--){
        //   for(int j=1; j<=i; j++){
        //       System.out.print("*");
        //   }
        //   for(k=1;k<=2*(n-i);k++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }


    //       * * * * * 
    //     * * * * *
    //    * * * * *
    //   * * * * *
    //  * * * * *
        // n=5;
        // for(int i=1; i<=n;i++){
        //   for(int k = n-i; k>=1;k--){
        //     System.out.print(" ");
        //   }
        //   for(int j = 1; j<=n;j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }


        //     1 
        //    2 2
        //   3 3 3
        //  4 4 4 4
        // 5 5 5 5 5
        // n=5;
        // for(int i=1; i<=n;i++){
        //   for(int k = (n-i); k>=1;k--){
        //     System.out.print(" ");
        //   }
        //   for(int j = 1; j<=i;j++){
        //     System.out.print(i+" ");
        //   }
        //   System.out.println();
        // }


        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        //  n=5;
        // for(int i=1; i<=n;i++){
        //   for(int k = (n-i); k>=1;k--){
        //     System.out.print(" ");
        //   }
        //   for(int j = i; j>=1;j--){
        //     System.out.print(j);
        //   }
        //   for(int j = 2; j<=i;j++){
        //     System.out.print(j);
        //   }
        //   System.out.println();
        // }


        
      //    *
      //   ***
      //  *****
      // *******
      // *******
      //  *****
      //   ***
      //    *
      //   n=4;
      //   for(int i=1; i<=n;i++){
      //     for(int k = n-i; k>=1;k--){
      //       System.out.print(" ");
      //     }
      //     for(int j = (2*i)-1; j>=1;j--){
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //   }
      //   for(int i=n; i>=1;i--){
      //     for(int k =n-i; k>=1;k--){
      //       System.out.print(" ");
      //     }
      //     for(int j = (2*i)-1; j>=1;j--){
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //   }


       
  }
}
