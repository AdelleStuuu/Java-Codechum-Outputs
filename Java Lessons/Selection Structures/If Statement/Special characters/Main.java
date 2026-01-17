import java.util.*;
public class Main  {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter character: ");
            var x  = scan.next().charAt(0);

            
            if (!(Character.isDigit(x) || Character.isLetter(x))) {
                System.out.println("Character is a special character.");
            }
        }
    }
}