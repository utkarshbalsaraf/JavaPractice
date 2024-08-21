import java.util.Scanner;

public class AmstrongNumber {
  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    number = sc.nextInt();
    boolean value = isArmStrong(number);
    if(value == true){
      System.out.println(number+ " is Amstrong Number");
    }else{
      System.out.println(number+ " is Not Amstrong Number");

    }
  }

  static boolean isArmStrong(int n) {
    int digits = 0;
    int temp = n;
    int sum = 0;
    while (temp > 0) {
      temp /= 10;
      digits++;
    }
    temp = n;
    while (temp > 0) {
      int lastDigit = temp % 10;
      sum += Math.pow(lastDigit, digits);
      temp /= 10;
    }
    if (sum == n) {
      return true;
    } else {
      return false;
    }
  }
}
