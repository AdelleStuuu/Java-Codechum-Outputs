import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int row = sc.nextInt();         
            System.out.print("Enter the number of columns: ");
            int col = sc.nextInt();
            
            int[][] array = new int[row][col];
            int[][] array2 = new int[row][col];
            String word = "";
            System.out.printf("Enter the elements of the first array:\n",word);
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++ ) {
                        System.out.printf("Element at [%d][%d]: ",i,j);
                        array[i][j] = sc.nextInt();
                        
                    }
                }
                
            System.out.printf("Enter the elements of the second array:\n",word);
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++ ) {
                        System.out.printf("Element at [%d][%d]: ",i,j);
                        array2[i][j] = sc.nextInt();
                        
                    }
                }
            
            int difference = 0;
            
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(array[i][j] != array2[i][j]) {
                        difference +=1;
                    }
                }
            }
            
            System.out.printf("Number of differences between the two matrices: %d",difference);
            array2[0][0] = sc.nextInt();
        }
    }
}