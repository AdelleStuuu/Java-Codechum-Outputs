import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            var digit = scan.nextLine();
            
            while(true) {
                int n = 0;
                for(int i = 0; i < digit.length(); i++) {
                    n++;
                }
                System.out.printf("Number of digits: %d",n);
                break;
            }
        }
        
    }
}