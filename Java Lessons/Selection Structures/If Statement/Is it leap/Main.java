import java.util.*;
public class Main  {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the year: ");
            var year  = scan.nextInt();

            
            if (!(year % 100 == 0)) {
                if (year % 4 == 0) {
                    System.out.println("Year is a leap year.");
                }
            } else {
                if (year % 400 == 0) {
                    System.out.println("Year is a leap year.");
                }
            }
        }
    }
}