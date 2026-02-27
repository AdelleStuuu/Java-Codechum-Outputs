import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            var num = scan.nextInt();
            
            for (int i = 0; i <= num; i++) {
                if (i % 2 != 0) {
                    System.out.printf("%d\n",(i));
                }
                
            }
        }
        
        
    }
}