public class StringBuilder1 {
  public static void main(String[] args) {
    // StringBuilder sb = new StringBuilder("Utkarsh");
    // System.out.println(sb);
    // sb.setCharAt(0,'P');
    // System.out.println(sb);
    // sb.insert(0, 'U');
    // System.out.println(sb);
    // sb.delete(1, 2);
    // System.out.println(sb);

    // Reverse Using String
    // String name = "Utkarsh";
    // String rev = "";
    // for (int i = name.length() - 1; i >= 0; i--) {
    // rev += name.charAt(i);
    // }
    // System.out.println(rev);

    // Reverse Using StringBuilder
    StringBuilder sb = new StringBuilder("Utkarsh");
    for (int i = 0; i < sb.length() / 2; i++) {
      int front = i;
      int back = sb.length() - 1 - i;

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      sb.setCharAt(front, backChar);
      sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);

  }
}
