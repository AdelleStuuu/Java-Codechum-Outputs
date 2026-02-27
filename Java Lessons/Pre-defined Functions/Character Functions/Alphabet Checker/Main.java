import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char charac = sc.next().charAt(0);
            System.out.print(Character.isLetter(charac));
        }
    }
}