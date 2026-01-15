import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter X: ");
            var x = scan.nextInt();
            System.out.print("Enter Y: ");
            var y = scan.nextInt();
            var z = x >> y;
            System.out.printf("%d >> %d = %d",x,y,z);
        }
    }
}