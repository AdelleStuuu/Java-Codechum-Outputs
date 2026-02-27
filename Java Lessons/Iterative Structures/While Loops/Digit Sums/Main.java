import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int digit = scan.nextInt();
            
            int sum = 0; 
            while(digit > 0) {
                sum += digit % 10;
                digit /= 10;
                
            }
            System.out.printf("Sum of digits: %d\n",sum);
        }
    }
}