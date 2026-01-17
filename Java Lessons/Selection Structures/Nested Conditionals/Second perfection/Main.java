import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            var num = scan.nextFloat();
            
            var squaredNumber = Math.sqrt(num);
            var cubedNumber = Math.cbrt(num);
            
            if (cubedNumber % 1 == 0) {
                if (squaredNumber % 1 == 0) {
                    System.out.print("Perfect in every way");
                } else {
                    if (cubedNumber % 2 == 0) {
                    System.out.print("Perfect in even cubes");
                    } else {
                        System.out.print("Perfect in an odd way");
                    }
                }
                
            } else {
                System.out.print("Nothing special");
            }
        }
        
    }
}