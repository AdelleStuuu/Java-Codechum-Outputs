import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num1 = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter a float: ");
            double num2 = scan.nextFloat();
            var diff = (double) num1 - num2; 
            System.out.printf("The difference is: %.2f",diff);
        }
    }
}