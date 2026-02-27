import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n; int sum = 0; 
            
            while (true) {
                System.out.print("Enter a number: ");
                n = scan.nextInt();
                
                if (n == 0) {
                    break;
                } else if (n < 0) {
                    continue;
                }
                
                sum += n;
            }
            
            System.out.printf("Sum: %d",sum);
        }
    }
}