import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = scan.nextLine();
            char[] chr = str.toCharArray();
            
            int aCount = 0; int bCount = 0;
            for (var i : chr) {
                if (i == 'a') {
                    aCount += 1;
                } else if (i == 'b') {
                    bCount += 1;
                }
                
            }
            
            System.out.printf("Number of 'a' occurrences: %d\n",(aCount));
            System.out.printf("Number of 'b' occurrences: %d\n",(bCount));
        }
    }
}