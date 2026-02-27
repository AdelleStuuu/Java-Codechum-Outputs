import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter lover1: ");
            var string1 = scan.nextLine();
            System.out.print("Enter lover2: ");
            var string2 = scan.nextLine();
            
            System.out.printf("%s and %s are in love.",string1,string2);
        }
    }
}