import java.util.*;
public class Main  {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            var x  = scan.nextInt();
            System.out.print("Enter second number: ");
            var y  = scan.nextInt();

            
            if ((x < 0 && y < 0) || (x > 0 && y > 0)) {
                System.out.println("Numbers have the same sign.");
            }
        }
    }
}