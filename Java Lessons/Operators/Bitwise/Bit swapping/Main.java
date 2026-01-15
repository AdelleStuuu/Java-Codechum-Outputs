import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            var x = scan.nextInt();
            System.out.print("Enter the second number: ");
            var y = scan.nextInt();
            System.out.printf("Before swap: num1 = %d, num2 = %d\n",x,y);
            x = x ^ y;
            y = x ^ y;
            x = x ^ y; 
            
            System.out.printf("After swap: num1 = %d, num2 = %d",x,y);
        }
    }
}