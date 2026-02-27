import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            var n = scan.nextInt();
            
            int ascii = 65; char charAscii = (char)ascii;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%c ",charAscii);
                    ascii++;
                    charAscii = (char)ascii;
                }
                System.out.print("\n");
            }
        }
        
    }
}