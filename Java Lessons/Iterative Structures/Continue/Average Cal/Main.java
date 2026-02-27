import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double n; double sum = 0; double nl = 0;
            
            while (true) {
                System.out.print("Enter a number: ");
                n = scan.nextInt();
                
                if (n == 0) {
                    break;
                } else if (n < 0) {
                    continue;
                }
                
                sum += n;
                nl++;
            }
            
            System.out.printf("Average: %.2f",sum/nl);
        }
    }
}