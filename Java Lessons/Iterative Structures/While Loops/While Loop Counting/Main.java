import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            var digit = scan.nextInt();
            
            int n = 0;
            while(n < digit) {
                n++;
                System.out.printf("%d\n",n);
                
            }
        }
        
    }
}