import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your birth year: ");
            double birthYear = scan.nextFloat();
            System.out.print("Enter the current year: ");
            double currentYear = scan.nextFloat();
            
            var age = currentYear - birthYear;
            var sqrt = Math.sqrt(age); 
            if (sqrt % 1.0 == 0) {
                System.out.print("Your age is a perfect square.");
            } else {
                System.out.print("Your age is not a perfect square.");
            }
        }
    }
}