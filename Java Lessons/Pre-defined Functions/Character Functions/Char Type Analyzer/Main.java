import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char charac = sc.next().charAt(0);
            System.out.println("Is Alpha: " + Character.isLetter(charac));
            System.out.println("Is Digit: " + Character.isDigit(charac));
            System.out.println("Is AlNum: " + Character.isLetterOrDigit(charac));
            System.out.println("To Upper: " + Character.toUpperCase(charac));
            System.out.println("Is Upper: " + Character.isUpperCase(charac));
            System.out.println("To Lower: " + Character.toLowerCase(charac));
            System.out.println("Is Lower: " + Character.isLowerCase(charac));
        }
    }
}