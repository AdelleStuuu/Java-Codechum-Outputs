import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n ;
            int sum = 0;
            
            while(true) {
                System.out.print("Enter a number: ");
                n = scan.nextInt();
                
                if (n >= 0) {
                    sum += n;
                } else {
                    break;
                }
                
            }
            System.out.printf("Sum of positive numbers: %d",sum);
        }
    }
}