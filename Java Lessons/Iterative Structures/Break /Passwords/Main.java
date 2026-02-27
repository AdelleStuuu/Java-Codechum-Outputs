import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String n;
            int attempts = 3;
            
            while(true) {
                if (attempts == 0) {
                    System.out.print("Access denied!");
                    break;
                }
                System.out.print("Enter the password: ");
                n = scan.nextLine();
                
                
                if (n.equals("secret")) {
                    System.out.print("Access granted!");
                    break;
                } else {
                    attempts--;
                    System.out.printf("Access denied! %d attempts remaining.\n", attempts);
                }
                
            }
        }
        
    }
}