import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            do {
                System.out.print("Enter an integer: ");
                n = scan.nextInt();
                if (n > 0) {
                    System.out.print("positive\n");
                } else if (n < 0) {
                    System.out.print("negative\n");
                }
            } while (n != 0);
        }
        
    }
}