
import java.util.Scanner;

public class greatestCommonDivisor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number 1 :");
    int a = sc.nextInt();
    System.out.println("Enter Number 2 :");
    int b = sc.nextInt();

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    System.out.println("GCD : " + a);
  }

}
