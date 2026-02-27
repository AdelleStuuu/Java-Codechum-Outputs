import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            var num = scan.nextInt();
            
            for (int i = 0; i < num; i++) {
                System.out.printf("%d\n",(i+1)*5);
            }
        }
        
        
    }
}