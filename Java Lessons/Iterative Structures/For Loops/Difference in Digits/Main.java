import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            var num = scan.nextInt();
            
            ArrayList<Integer> digits = new ArrayList<>();
            while (num > 0) {
                digits.add(num % 10);
                num /= 10;
            }
            
            int n = 0; int sum = 0;
            for(int i : digits){
                if (n == 0) {
                    sum = i;
                } else {
                    sum -= i;
                }
                n++;
            }
            System.out.printf("Result of subtracting digits: %d",sum);
        }
        
    }
}