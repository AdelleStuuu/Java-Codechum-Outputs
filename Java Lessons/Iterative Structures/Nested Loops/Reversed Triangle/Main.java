import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            var n = scan.nextInt();
            
            
            int t = n;
            for (int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    if (j < t) {
                        System.out.printf(" ");
                    } else {
                        System.out.printf("%d",i);
                        
                        
                    }
                    
                }
                t--;
                System.out.print("\n");
            }
        }
        
    }
}