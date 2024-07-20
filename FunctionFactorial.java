import java.util.Scanner;

public class FunctionFactorial {

  public static int factorial(int n) {
    if (n <= 0) {
      System.out.println("Enter positive non zero number");
      return 0;
    } else {
      int sum = 1;
      for (int i = n; i >= 1; i--) {
        sum = sum * i;
      }
      return sum;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();

    int sum = factorial(n);
    System.out.println("Factorial is :" + sum);
  }

}
