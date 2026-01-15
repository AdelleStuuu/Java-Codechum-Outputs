import java.util.*;
public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the price: ");
            double x = scan.nextDouble();
            
            x *= 1.1;
            
            System.out.printf("The new price is: %.2f",x);
        }
    }
}