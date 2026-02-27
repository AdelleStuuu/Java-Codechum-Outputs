import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n; int f = 1;
            System.out.print("Enter an integer: ");
            n = scan.nextInt();
            String string = ""; 
            
            do {
                if (n % f == 0) {
                    string += f + " ";
                }
                f++;
            } while (f != n+1);
            System.out.printf("Factors of %d: %s",n,string);
        }
    }
}