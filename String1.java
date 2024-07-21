import java.util.Scanner;

public class String1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1
    // String firstName = "utkarsh";
    // String lastName = "balsaraf";
    // String fullName = firstName + "@" + lastName;

    // for (int i = 0; i < fullName.length(); i++) {
    // System.out.println(fullName.charAt(i));
    // }

    // 2
    // String name1 = "tony";
    // String name2 = "tony";
    // if (name1.compareTo(name2) == 0) {
    // System.out.println("Strings are equal");
    // } else {
    // System.out.println("Strings are not equal");
    // }

    // 3
    // String sentence = "my name is utkarsh";
    // String name = sentence.substring(11);
    // System.out.println(name);

    // 4 change charachter of a string
    String str = sc.nextLine();
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        result += 'i';
      } else {
        result += str.charAt(i);
      }
    }
    System.out.println(result);
  }
}