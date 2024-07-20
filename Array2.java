import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length");
    int size = sc.nextInt();
    String names[] = new String[size];
    System.out.println("enter Names");

    for (int i = 0; i < size; i++) {
      names[i] = sc.next();
    }

    for (int i = 0; i < names.length; i++) {
      System.out.println("Names Are");
      System.out.println(names[i]);
    }
  }
}
