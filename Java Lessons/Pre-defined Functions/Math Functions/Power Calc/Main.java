import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base: ");
            double num = sc.nextDouble();
            System.out.print("Enter the exponent: ");
            double num2 = sc.nextDouble();
            double res = Math.pow(num,num2);
            System.out.printf("Result: %.2f",res);
        }
        
    }
}