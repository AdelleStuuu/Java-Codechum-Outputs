import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.print("Concatenated string: " + str + "Hello");
        }
    }
}