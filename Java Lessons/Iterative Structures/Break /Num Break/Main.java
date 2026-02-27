import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            
            while(true) {
                System.out.print("Enter a number: ");
                n = scan.nextInt();
                
                if (n != 0) {
                    System.out.printf("Number: %d\n",n);
                } else {
                    break;
                }
                
            }
        }
        
    }
}