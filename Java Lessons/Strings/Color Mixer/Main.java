import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter color 1: ");
            var string1 = scan.nextLine();
            System.out.print("Enter color 2: ");
            var string2 = scan.nextLine();
            System.out.print("Enter color 3: ");
            var string3 = scan.nextLine();
            
            System.out.printf("Mixing %s, %s, and %s creates a new color!",string1,string2,string3);
        }
    }
}