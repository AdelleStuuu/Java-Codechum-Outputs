import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = 0;
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            do {
                n++;
                System.out.printf("%d\n",n);
            } while (n != num);
        }
        
    }
}