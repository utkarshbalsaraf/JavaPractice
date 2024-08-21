public class FibonacciSeries {
  public static void main(String[] args) {
    int number = 30;
    int firstNum = 0;
    int secondNum = 1;
    int nextNum;
    for (int i = 1; i <= number; i++) {
      System.out.print(firstNum + ", ");
      nextNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = nextNum;
    }
  }
}
