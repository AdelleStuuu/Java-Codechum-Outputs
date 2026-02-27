import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            var n = scan.nextInt();
            
            String pf = "";
            
            for (int i = 1; i <= n; i++) {
                
                if (i == 4) {
                    continue;
                }
                
                
               
                pf += i + " ";
                
                
                
            }
            
            System.out.printf("%s",pf);
        }
    }
}