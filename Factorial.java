import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    number = sc.nextInt();
    int answer = factorial(number);
    System.out.println(" Factorial of "+number+" is : "+answer);
  }

  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }
}
