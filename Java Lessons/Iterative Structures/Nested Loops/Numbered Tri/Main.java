import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            var n = scan.nextInt();
            
            for (int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.print("\n");
            }
        }
        
    }
}