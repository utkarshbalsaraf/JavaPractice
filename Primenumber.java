import java.util.Scanner;

public class Primenumber {
  public static void main(String[] args) {
    int number;
    System.out.println("Enter the number to know its prime or not");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();

    int flag = 0;
    if (number == 0 || number == 1) {
      System.out.println(number + " is not Prime Number");
    } else {
      int middleNum = number / 2;
      for (int i = 2; i <= middleNum; i++) {
        if (number % i == 0) {
          System.out.println(number + " is not Prime Number");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(number + " is Prime Number");

      }
    }
    sc.close();
  }
}
