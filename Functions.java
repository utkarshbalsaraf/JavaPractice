import java.util.Scanner;

public class Functions {
  public static int calculateSum(int a, int b){
    int sum = a+b;
    return sum;
  }

  public static void factorialC(int a){
    if(a<0){
      System.out.println("Invalid Number");
      return;
    }
    int sum  = 1;
    for(int i =a; i>0; i--){
      sum = sum*i;
    }
    System.out.println("Factorail is: "+sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // int b = sc.nextInt();

    // System.out.println(calculateSum(a, b));
    factorialC(a);
  }
}
