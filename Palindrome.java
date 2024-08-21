import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    number = sc.nextInt();
    int reverse =0, temp=number;
    while(temp>0){
      int remainder = temp %10;
      reverse = reverse*10 + remainder;
      temp /= 10;
    }
    if(number == reverse){
      System.out.println("Number is Palindrome");
    }else{
      System.out.println("Number is not Palindrome");
    }

  }
}
