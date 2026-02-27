import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int digit = scan.nextInt();
            
            int sqr; int n = 0;
            while(n < digit) {
                n++;
                sqr = n * n;
                System.out.printf("%d\n",sqr);
                
            }
        }
        
    }
}