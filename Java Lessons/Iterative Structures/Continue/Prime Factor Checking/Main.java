import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            var n = scan.nextInt();
            
            String pf = "";
            
            for (int i = 1; i < n; i++) {
                
                if (i != 2) {
                    if (i % 3 == 0 || i % 2 == 0 || i <= 1) {
                    continue;
                    }
                }
                
                
                if (n % i == 0) {
                    pf += i + " ";
                } 
                
                
                
            }
            
            System.out.printf("Prime factors of %d (excluding multiples of 3): %s",n,pf);
        }
    }
}