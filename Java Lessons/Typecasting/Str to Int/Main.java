import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String char1 = scan.nextLine();
            
            int convert = Integer.parseInt(char1);
            System.out.printf("String converted to integer: %d",convert);
        } 
    }
}