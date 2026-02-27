import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String n;
            String r; 
            
            while(true) {
                r = "";
                System.out.print("Enter a word: ");
                n = scan.nextLine();
                
                for (int i = 0; i < n.length(); i++) {
                    r = n.charAt(i) + r;
                }
                
                if (r.equals(n)) {
                    System.out.printf("Palindrome found!");
                    break;
                }
                 
            }
        }
        
    }
}