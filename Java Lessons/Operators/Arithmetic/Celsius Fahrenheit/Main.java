import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double x = scan.nextFloat();
            double f = x * (9.0/5.0) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f",f);
        }
    }
}