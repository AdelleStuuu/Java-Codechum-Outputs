import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            var digit = scan.nextInt();
            
            int n = 0;
            while(n < digit) {
                n++;
                if (n % 2 == 0) {
                    System.out.printf("%d\n",n);
                }
                
                
            }
        }
        
    }
}