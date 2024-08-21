import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();
    String reverseStr = "";
    char ch;
    for (int i = str.length() - 1; i >= 0; i--) {
      ch = str.charAt(i);
      reverseStr += ch;
    }
    System.out.println("Reverse String is :\n " + reverseStr);
  }
}
