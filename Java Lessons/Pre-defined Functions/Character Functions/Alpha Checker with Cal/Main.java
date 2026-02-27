import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first character: ");
            char charac = sc.next().charAt(0);
            System.out.print("Enter the second character: ");
            char charac2 = sc.next().charAt(0);
            System.out.print("Enter the third character: ");
            char charac3 = sc.next().charAt(0);
            System.out.println(Character.isLetter(charac));
            System.out.println(Character.isLetter(charac2));
            System.out.println(Character.isLetter(charac3));
        }
    }
}