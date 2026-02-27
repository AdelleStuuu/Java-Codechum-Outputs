import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter character 1: ");
            var char1 = scan.next().charAt(0);
            System.out.print("Enter character 2: ");
            var char2 = scan.next().charAt(0);
            
            char lesserChar;
            if ((int) char1 < (int) char2) {
                lesserChar = char1;
            } else {
                lesserChar = char2;
            }
            System.out.printf("The lesser character is: %s",lesserChar);
        }
    }
}