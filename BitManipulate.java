import java.util.Scanner;

public class BitManipulate {
  public static void main(String[] args) {

    // GET BIT
    // int n =5;
    // int pos = 0;
    // int bitMask = 1<<pos;

    // if((bitMask & n) ==0){
    // System.out.println("bit was 0");
    // }else{
    // System.out.println("Bit is 1");
    // }

    // SET BIT
    // int n = 5;
    // int pos = 1;
    // int bitMask = 1 << pos;

    // int newN = bitMask | n ;
    // System.out.println(newN);

    // CLEAR BIT
    // int n = 5;
    // int pos = 2;
    // int bitMask = 1 << pos;
    // int notBitMask = ~(bitMask);

    // int newNumber = notBitMask & n;
    // System.out.println(newNumber);

    // UPDATE BIT
    // if you want to update to 0 use clearbit and if you want to update to 1 use
    // setbit
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the operation that you want to perform");
    int operation = sc.nextInt();
    int n = 5;
    int pos = 3;
    int bitMask = 1 << pos;
    int notBitMask = ~(bitMask);

    if (operation == 1) {
      int newN = bitMask | n;
      System.out.println(newN);
    } else {
      int newN = notBitMask & n;
      System.out.println(newN);
    }

  }
}
