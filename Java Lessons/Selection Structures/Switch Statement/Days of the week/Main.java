import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number between 1 and 7: ");
            var day = scan.nextInt();
            
            switch(day) {
                case 1 -> System.out.print("Monday");
                case 2 -> System.out.print("Tuesday");
                case 3 -> System.out.print("Wednesday");
                case 4 -> System.out.print("Thursday");
                case 5 -> System.out.print("Friday");
                case 6 -> System.out.print("Saturday");
                case 7 -> System.out.print("Sunday");
                default -> System.out.print("Invalid input.");
            }
        }
    }
}