import java.util.*;
public class Main  {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter x: ");
            var x  = scan.nextLine();
            System.out.print("Enter y: ");
            var y  = scan.nextLine();
            System.out.print("Enter z: ");
            var z  = scan.nextLine();
            
            if (x.equals(y) && y.equals(z)) {
                System.out.println("Triangle is equilateral.");
            }
        }
    }
}