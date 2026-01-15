import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            var x = scan.nextInt();
            var y = x & 25;
            System.out.printf("%d AND 25 = %d",x,y);
        }
    }
}