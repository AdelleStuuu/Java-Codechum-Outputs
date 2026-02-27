import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.00");
            
            System.out.print("Enter the number of rows: ");
            int row = sc.nextInt();         
            System.out.print("Enter the number of columns: ");
            int col = sc.nextInt();
            
            int[][] array = new int[row+1][col+1];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++ ) {
                    System.out.printf("Element at [%d][%d]: ",i,j);
                    array[i][j] = sc.nextInt();
                }
            }
            String sums = ""; 
            double sum = 0; int counter = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++ ) {
                    sum += array[i][j];
                    
                }
                
                counter++;
                sums += "Row " +counter +": "+ df.format(sum/col) + "\n";
                sum = 0;
                
            }
            
            System.out.printf("Averages of each row:\n%s",sums);
        }
    }
}