import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first score: ");
            var score1 = scan.nextInt();
            
            System.out.print("Enter the second score: ");
            var score2 = scan.nextInt();
            
            if (score2 <= score1) {
                if (score1 >= 80) {
                    System.out.print("Excellent!");
                } else {
                    System.out.print("Good job!");
                }
                
            } else {
                System.out.print("Keep up the good work!");
            }
        }
        
    }
}