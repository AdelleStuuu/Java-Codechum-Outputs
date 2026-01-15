import java.util.*;
public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter x: ");
            var x = scan.nextInt();
            System.out.print("Enter y: ");
            var y = scan.nextInt();
            System.out.print("Enter z: ");
            var z = scan.nextInt();
            
            x += y; x += z;

            System.out.printf("Result: %d",x);
        }
    }
}