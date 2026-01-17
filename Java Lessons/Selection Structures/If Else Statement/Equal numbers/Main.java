import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            var x = scan.nextInt();
            System.out.print("Enter second number: ");
            var y = scan.nextInt();
            System.out.print("Enter third number: ");
            var z = scan.nextInt();
            
            if ((x == y) && (x == z)) {
                System.out.print("All numbers are equal. ");
            } else {
                System.out.print("Not all numbers are equal. ");
            }
        }
    }
}