import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            var x = scan.nextInt();
  
            
            if (x % 4 == 0) {
                System.out.println("The number is divisible by 4.");
            } else if (x % 3 == 0) {
                System.out.println("The number is divisible by 3.");
            } else if (x % 2 == 0) {
                System.out.println("The number is divisible by 2.");
            } else {
                System.out.println("The number is not divisible by 2, 3, or 4.");
            }
        }
    }
}