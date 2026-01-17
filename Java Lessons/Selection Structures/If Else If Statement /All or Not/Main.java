import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            var x = scan.nextInt();
            System.out.print("Enter second number: ");
            var y = scan.nextInt();
            System.out.print("Enter third number: ");
            var z = scan.nextInt();
            
            if (x > 0 && y > 0 && z  > 0) {
                System.out.println("All numbers are positive.");
            } else if (x < 0 && y < 0 && z < 0) {
                System.out.println("All numbers are negative.");
            } else if (x % 2 == 0 && y % 2 == 0 && z % 2 == 0) {
                System.out.println("All numbers are even.");
            } else if (x % 2 != 0 && y % 2 != 0 && z % 2 != 0) {
                System.out.println("All numbers are odd.");
            } else {
                System.out.println("Numbers are different.");
            }
        }
    }
}