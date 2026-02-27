import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter First Character: ");
            var c1 = scan.next().charAt(0);
            System.out.print("Enter Second Character: ");
            var c2 = scan.next().charAt(0);
            System.out.print("Enter Size: ");
            var s = scan.nextInt();
            
            for (int i = 1; i <= s; i++) {
                for(int j = 1; j <= i; j++) {
                    if (j < i) {
                        System.out.printf("-");
                    } else {
                        if (j % 2 == 0) {
                            System.out.printf("%c",c2);
                        } else {
                            System.out.printf("%c",c1);
                        }
                        
                    }
                    
                }
                System.out.print("\n");
            }
        }
        
    }
}