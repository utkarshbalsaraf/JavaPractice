import java.util.Scanner;

public class power {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number :");
    int number = sc.nextInt();

    System.out.println("Enter Power :");
    int power = sc.nextInt();
    int multiply = 1;
    int num = number;
    for(int i=1; i<=power;i++){
      multiply *=num; 
    }
    System.out.println(number+" to the power "+power+" is: "+multiply);
  }
}
