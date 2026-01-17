import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Quadrilateral type (S for Square, R for Rectangle, P for Parallelogram, T for Trapezoid): ");
            var Quadrilateral = scan.next().charAt(0);
            
            scan.nextLine();
            
            switch(Quadrilateral) {
                case 'P', 'p' -> {
                    System.out.println("Properties of a Parallelogram:");
                    System.out.println(" - Opposite sides are parallel");
                    System.out.println(" - Opposite angles are equal");
                }
                case 'R', 'r' -> {
                    System.out.println("Properties of a Rectangle:");
                    System.out.println(" - Opposite sides are equal");
                    System.out.println(" - All angles are 90 degrees");
                }
                case 'S', 's' -> {
                    System.out.println("Properties of a Square:");
                    System.out.println(" - All sides are equal");
                    System.out.println(" - All angles are 90 degrees");
                }
                case 'T', 't' -> {
                    System.out.println("Properties of a Trapezoid:");
                    System.out.println(" - One pair of opposite sides are parallel");
                    System.out.println(" - Adjacent angles are supplementary");
                }
                default -> System.out.print("Invalid Quadrilateral type.");
            }
        }
    }
}