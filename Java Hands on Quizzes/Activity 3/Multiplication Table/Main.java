import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number to generate its multiplication table: ");
            var n = scan.nextInt();
            
            int num;
            System.out.printf("\nMultiplication Table up to %d:\n--------------------------------\n",n);
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {

                    num = i * j;
                    System.out.printf("%d\t",num);
                    
                    
                    
                }
                System.out.printf("\n");
            }
        }
        
    }
}