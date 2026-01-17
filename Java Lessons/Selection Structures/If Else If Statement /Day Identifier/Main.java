import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter day: ");
            var x = scan.nextInt();
  
            
            if (x != 1) if (x == 2) {
                System.out.println("Tuesday");
            } else if (x == 3) {
                System.out.println("Wednesday");
            } else if (x == 4) {
                System.out.println("Thursday");
            } else if (x == 5) {
                System.out.println("Friday");
            } else if (x == 6) {
                System.out.println("Saturday");
            } else if (x == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("Invalid input");
            } else {
                System.out.println("Monday");
            }
        }
    }
}