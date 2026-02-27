import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            
            
            do {
                System.out.print("Enter a number: ");
                n = scan.nextInt();
                
                if (n % 3 == 0 && n % 5 == 0) {
                    System.out.print("FizzBuzz\n");
                } else {
                    if (n % 3 == 0) {
                        System.out.print("Fizz\n");
                    } else if (n % 5 == 0) {
                        System.out.print("Buzz\n");
                    } else {
                        System.out.printf("%d\n",n);
                    }
                }
            } while (n != 0);
        }
        
    }
}