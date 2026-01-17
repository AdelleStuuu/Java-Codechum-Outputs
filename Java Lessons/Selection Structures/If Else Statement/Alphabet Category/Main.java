import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            var c = scan.next().charAt(0);
            var lower = Character.toLowerCase(c);
            if (lower == 'a' ||lower == 'e' ||lower == 'o' ||lower == 'i' ||lower == 'u') {
                System.out.print("The character is a vowel.");
            } else {
                System.out.print("The character is a consonant.");
            }
        }
    }
}