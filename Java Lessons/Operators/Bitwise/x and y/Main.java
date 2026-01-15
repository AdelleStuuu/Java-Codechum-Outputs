import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            var x = scan.nextInt();
            System.out.print("Enter the second integer: ");
            var y = scan.nextInt();
            var z = x & y;
            System.out.printf("%d AND %d = %d",x,y,z);
        }
    }
}