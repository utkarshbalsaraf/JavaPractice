import java.util.Scanner;

public class Array4_2d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Rows");
    int row = sc.nextInt();
    System.out.println("Enter Columns");
    int column = sc.nextInt();
    int matrix1[][] = new int[row][column];

    for (int i = 0; i < row; i++) {
      System.out.println("Enter row "+ i+1);
      for (int j = 0; j < column; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }

    for(int i =0;i<row;i++){
      for(int j =0;j<column;j++){
        System.out.print(matrix1[i][j]+" ");
      }
      System.out.println();
    }
  }
}
