import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n; 
            
            System.out.print("Enter a number: ");
            n = scan.nextInt();
            String pf = "";
            
            for (int i = 0; i <= n; i++) {
                if (i == 10 || i % 2 != 0) {
                    continue;
                }
                
                pf += i + " ";
            }
            
            System.out.printf("%s",pf);
        }
    }
}