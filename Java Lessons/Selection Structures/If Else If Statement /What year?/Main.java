import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int x = scan.nextInt();
  
            
            if (x % 100 == 0) {
                if (x % 400 == 0) {
                    System.out.print("It's a leap century year.");
                } else {
                    System.out.print("It's a century year.");
                }
            } else if (x % 4 == 0) {
                System.out.print("It's a leap year.");
            } else {
                System.out.print("It's neither a leap year nor a century year.");
            }
        }
    }
}