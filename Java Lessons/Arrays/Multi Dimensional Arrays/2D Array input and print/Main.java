import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int row = sc.nextInt();         
            System.out.print("Enter the number of columns: ");
            int col = sc.nextInt();
            
            int[][] array = new int[row+1][col+1];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++ ) {
                    System.out.printf("Element at [%d][%d]: ",i,j);
                    array[i][j] = sc.nextInt();
                }
            }
            System.out.println("Elements of the array:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++ ) {
                    System.out.printf("%d ",array[i][j]);
                
                }
                System.out.printf("\n");
            }
        }
    }
}