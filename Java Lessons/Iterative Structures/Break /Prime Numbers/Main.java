import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            var n = scan.nextInt();
            
            for (int i = 3; i <= Math.sqrt(n); i++) {
                if (n <= 1) {
                    System.out.printf("%d is not a prime number",n);
                    break;
                } else if (n == 2) {
                    System.out.printf("%d is a prime number",n);
                    break;
                } else if (n % 2 == 0) {
                    System.out.printf("%d is not a prime number",n);
                    break;
                } else {
                    if (n % i == 0) {
                        System.out.printf("%d is not a prime number",n);
                        break;
                    } else {
                        System.out.printf("%d is a prime number",n);
                        break;
                    }
                }
                
            }
        }
    }
}