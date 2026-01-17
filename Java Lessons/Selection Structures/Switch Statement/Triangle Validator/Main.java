import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the triangle type identifier (E for Equilateral, I for Isosceles, S for Scalene): ");
            var triangle = scan.next().charAt(0);
            
            scan.nextLine();
            
            System.out.print("Enter the length of side 1: ");
            var side1 = scan.nextInt();
            System.out.print("Enter the length of side 2: ");
            var side2 = scan.nextInt();
            System.out.print("Enter the length of side 3: ");
            var side3 = scan.nextInt();
            
            switch(triangle) {
                case 'E', 'e' -> {
                    if (side1 == side2 && side1 == side3) {
                        System.out.print("The given sides form an Equilateral triangle.");
                    } else {
                        System.out.print("The given sides do not form an Equilateral triangle.");
                    }
                }
                case 'I', 'i' -> {
                    if (side1 == side2 || side1 == side3 || side2 == side3) {
                        System.out.print("The given sides form an Isosceles triangle.");
                    } else {
                        System.out.print("The given sides do not form an Isosceles triangle.");
                    }
                }
                case 'S', 's' -> {
                    if (side1 != side2 && side1 != side3 && side2 != side3) {
                        System.out.print("The given sides form a Scalene triangle.");
                    } else {
                        System.out.print("The given sides do not form a Scalene triangle.");
                    }
                }
                default -> System.out.print("Invalid triangle type identifier.");
            }
        }
    }
}