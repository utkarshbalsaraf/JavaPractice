import java.util.Scanner;

public class Array3MinMax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    System.out.println("Enter numbers");
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    System.out.println("Max number is :" + max);
    System.out.println("Min number is :" + min);

  }

}
