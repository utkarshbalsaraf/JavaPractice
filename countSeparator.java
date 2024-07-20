import java.util.Scanner;

public class countSeparator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;
    String continueInput;

    do {
      System.out.println("Enter the Number:");
      int number = sc.nextInt();

      if (number > 0) {
        positiveCount++;
      } else if (number < 0) {
        negativeCount++;
      } else {
        zeroCount++;
      }
      System.out.println("Do you want to continue(yes/no)?");
      continueInput = sc.next();
    } while (continueInput.equalsIgnoreCase("yes"));

    System.out.println("Positive Number Count: " + positiveCount);
    System.out.println("Negative Number Count: " + negativeCount);
    System.out.println("Positive Number Count: " + zeroCount);

    sc.close();
  }
}
