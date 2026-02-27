import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            var string1 = scan.nextLine();
            System.out.print("Enter the second string: ");
            var string2 = scan.nextLine();
            
            System.out.printf("%s %s %s",string1,string2,string1);
        }
    }
}