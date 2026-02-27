
public class Main {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        
        int[][] array = new int[row][col];
            
        int val = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++ ) {
                array[i][j] = val;
                val++;
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++ ) {
                System.out.printf("%d\t",array[i][j]);
                
            }
            System.out.printf("\n");
        }
    }
}