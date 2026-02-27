import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first character: ");
            char num1 = scan.next().charAt(0);
            System.out.print("Enter second character: ");
            char num2 = scan.next().charAt(0);
            
            int Ascii1 = (int) num1; int Ascii2 = (int) num2;
            
            int sum = Ascii1 + Ascii2; 
            System.out.printf("Sum: %d",sum);
        }
    }
}