import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a string containing a float: ");
            var num1 = scan.nextFloat();
            double num2 = num1;
            System.out.printf("Floating-point number: %.2f",num2);
        }
    }
}