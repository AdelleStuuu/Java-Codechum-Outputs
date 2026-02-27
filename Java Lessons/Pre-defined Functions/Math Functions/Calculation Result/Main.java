import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            
            double res = Math.sqrt(Math.pow(Math.abs(num - num2),3));
            System.out.printf("Result: %.2f",res);
        }
        
    }
}