import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            var number = scan.nextInt();
            
            if (number % 2 != 0) {
                if (number % 3 != 0) {
                    System.out.print("Odd number");
                } else {
                    System.out.print("Oddly divisible by 3");
                }
                
            } else {
                if (number % 4 != 0) {
                    System.out.print("Even number");
                } else {
                    System.out.print("Evenly divisible by 4");
                }
            
            }
        }
        
    }
}