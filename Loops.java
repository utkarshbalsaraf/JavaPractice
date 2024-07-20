import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter text to repeat");
    String text1 = sc.nextLine();
    System.out.println("Enter how many times it should repeat");
    int repeat = sc.nextInt();

    // for(int i=0; i<= repeat;i++){
    //   System.out.println(text1);
    // }

    int i = 0;
    while(i<=repeat){
      System.out.println(text1);
      i++;
    }
  }
}
